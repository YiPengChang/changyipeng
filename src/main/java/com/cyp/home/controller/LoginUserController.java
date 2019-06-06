package com.cyp.home.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.druid.util.StringUtils;
import com.cyp.home.model.ResultJson;
import com.cyp.home.model.SysParamsModel;
import com.cyp.home.model.UserMember;
import com.cyp.home.service.EmailService;
import com.cyp.home.service.SysParamsService;
import com.cyp.home.service.UserMemberService;
import com.cyp.home.service.impl.SysParamsConTent;
import com.cyp.home.utils.ContextUtils;
import com.cyp.home.utils.Utils;
@Controller
public class LoginUserController {
	private static Logger logger = LoggerFactory.getLogger(LoginUserController.class);
	@Autowired
	private UserMemberService userMemberService;
	
	@Autowired
	EmailService emailService;
	
	@Autowired
	SysParamsService sysParamsService;
	
	//退出登录
	@RequestMapping(value = {"unLogin.htm"})
	public String unLogin(HttpServletRequest request) throws Exception {
		HttpSession session = request.getSession();
		if(session != null) {
			session.removeAttribute("loginUser");
		}
		return "views/login";
	}
	
	/**
	 * 登录接口
	 * @param userMember
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = {"login.htm"})
	public ResultJson login(UserMember userMember,HttpServletRequest request) throws Exception {
		ResultJson resultJson = new ResultJson();
		resultJson.setCode("0");
		
		String userName = userMember.getUserName();
		String password = userMember.getPassword();
		if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)) {
			resultJson.setCode("1");
			resultJson.setMsg("不能为空！");
			return resultJson;
		}
		UserMember queryUserMember = new UserMember();
		queryUserMember.setUserName(userName);
		UserMember resultUserMember = userMemberService.getUserMemberByparams(queryUserMember);
		if(resultUserMember == null) {
			resultJson.setCode("1");
			resultJson.setMsg("用户名或密码错误！");
			return resultJson;
		}
		if(!password.equals(resultUserMember.getPassword())) {
			resultJson.setCode("1");
			resultJson.setMsg("用户名或密码错误！");
			return resultJson;
		}
		HttpSession session = request.getSession();
		session.setAttribute("loginUser", resultUserMember);
		
		resultJson.setMsg("登陆成功");
		return resultJson;
	}
	
	/**
	 * 注册接口
	 */
	@ResponseBody
	@RequestMapping(value = {"register.htm"})
	public ResultJson register(UserMember userMember,HttpServletRequest request,@RequestParam("license") String license) {
		String customer = (String)request.getSession().getAttribute("customer");
		ServletContext servletContext = ContextUtils.getServletContext();
		String code = (String)servletContext.getAttribute(customer+"register");
		
		ResultJson resultJson = new ResultJson();
		resultJson.setCode("0");
		String valideRegister = valideRegister(userMember,license,code,true);
		if(!StringUtils.isEmpty(valideRegister)) {
			resultJson.setCode("1");
			resultJson.setMsg(valideRegister);
			return resultJson;
		}
		UserMember query = new UserMember();
		query.setUserName(userMember.getUserName());
		UserMember num = userMemberService.getUserMemberByparams(query);
		if(num != null) {
			resultJson.setCode("1");
			resultJson.setMsg("用户名已被占用！");
			return resultJson;
		}
		int count = userMemberService.addUserMember(userMember);
		if(count != 1) {
			resultJson.setCode("1");
			resultJson.setMsg("注册失败！");
			return resultJson;
		}
		servletContext.removeAttribute(customer+"register");
		return resultJson;
	}
	
	private String valideRegister(UserMember userMember,String license,String num,boolean flag) {
		String result = "";
		if(StringUtils.isEmpty(userMember.getRealName()) ||
		   StringUtils.isEmpty(userMember.getMobile()) ||
		   StringUtils.isEmpty(userMember.getEmail()) || 
		   StringUtils.isEmpty(userMember.getUserName()) || 
		   StringUtils.isEmpty(userMember.getPassword())) {
			result = "不能为空！";
			return result;
		}
		
		if(flag) {
			if(StringUtils.isEmpty(num)) {
				result = "系统错误！";
				logger.error("获取注册码为空");
				return result;
			}else {
				if(!num.equals(license)) {
					logger.error("注册码错误！请向管理员索要");
					result = "注册码错误！请向管理员索要";
					return result;
				}
			}
		}
		
		return result;
	}
	
	@RequestMapping("getRegister.htm")
	public String getRegister(HttpServletRequest request) {
		String customer = (String)request.getSession().getAttribute("customer");
		if(StringUtils.isEmpty(customer)) {
			request.getSession().setAttribute("customer", Utils.getNum(36));
		}
		
		return "views/register";
	}
	
	//生成验证码发给前端
	@ResponseBody
	@RequestMapping("getYanZhengCode.htm")
	public ResultJson getYanZhengCode(HttpServletRequest request) {
		ServletContext servletContext = ContextUtils.getServletContext();
		ResultJson resultJson = new ResultJson();
		
		String customer = (String)request.getSession().getAttribute("customer");
		if(!StringUtils.isEmpty((String)servletContext.getAttribute(customer)) &&
				 "secess".equals((String)servletContext.getAttribute(customer))) {
			resultJson.setCode("1");
			return resultJson;
		}
		
		int i1 =Integer.parseInt(Utils.getNum(2));
		int i2 =Integer.parseInt(Utils.getNum(3));
		int i3 =Integer.parseInt(Utils.getNum(2));
		resultJson.setMsg("请计算："+(i1+"*")+(i2+"*")+(i3+""));
		servletContext.setAttribute(customer, (i1*i2*i3)+"");
		return resultJson;
	}
	
	//生成注册码
	@ResponseBody
	@RequestMapping("getYanZhengCode2.htm")
	public ResultJson getYanZhengCode2(HttpServletRequest request,UserMember userMember,@RequestParam("code") String code) {
		ResultJson resultJson = new ResultJson();
		String valid = valideRegister(userMember,null,null,false);
		if(!StringUtils.isEmpty(valid)) {
			resultJson.setCode("1");
			resultJson.setMsg(valid);
			return resultJson;
		}
		
		String customer = (String)request.getSession().getAttribute("customer");
		ServletContext servletContext = ContextUtils.getServletContext();
		String resCode = (String)servletContext.getAttribute(customer);
		if(!StringUtils.isEmpty(resCode) && !StringUtils.isEmpty(code) && code.equals(resCode)) {
			resultJson.setCode("0");
			resultJson.setMsg("注册码已发送至管理员，请与之索要");
			servletContext.setAttribute(customer, "secess");
			try {
				sendEegisterCode(servletContext,customer,userMember);
				return resultJson;
			} catch (Exception e) {
				logger.error("发送邮件异常",e);
				resultJson.setCode("1");
				resultJson.setMsg("系统错误，请稍后再试或联系管理员！");
				return resultJson;
			}
		}else {
			resultJson.setCode("1");
			resultJson.setMsg("验证码错误，请认真计算再填写！");
			return resultJson;
		}
//		return resultJson;
	}
	
	public void sendEegisterCode(ServletContext servletContext,String customer,UserMember userMember) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		
		SysParamsModel sysParamsModel = sysParamsService.getSysParamsModelByKey(SysParamsConTent.REGISTER_TO_EMAIL);
		String value = sysParamsModel.getKeyValue();
		String[] valueArr = value.split(",");
		//生成注册码
		String num = Utils.getNum(6);

		for(String email : valueArr) {
			emailService.sendSimpleMail(email, "注册码"+sdf.format(new Date()), userMember.toString()+"。注册码是："+num);
		}
		servletContext.setAttribute(customer+"register", num);
	}
}
