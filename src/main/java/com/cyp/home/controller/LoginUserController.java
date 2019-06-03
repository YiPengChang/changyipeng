package com.cyp.home.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.cyp.home.model.ResultJson;
import com.cyp.home.model.UserMember;
import com.cyp.home.service.RoomInfoService;
import com.cyp.home.service.UserMemberService;
@Controller
public class LoginUserController {
	@Autowired
	private UserMemberService userMemberService;
	
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
		ResultJson resultJson = new ResultJson();
		resultJson.setCode("0");
		String valideRegister = valideRegister(userMember);
		if(!StringUtils.isEmpty(valideRegister)) {
			resultJson.setCode("1");
			resultJson.setMsg(valideRegister);
			return resultJson;
		}
		
		int count = userMemberService.addUserMember(userMember);
		if(count != 1) {
			resultJson.setCode("1");
			resultJson.setMsg("注册失败！");
			return resultJson;
		}
		return resultJson;
	}
	
	private String valideRegister(UserMember userMember) {
		String result = "";
		if(StringUtils.isEmpty(userMember.getRealName()) ||
		   StringUtils.isEmpty(userMember.getMobile()) ||
		   StringUtils.isEmpty(userMember.getEmail()) || 
		   StringUtils.isEmpty(userMember.getUserName()) || 
		   StringUtils.isEmpty(userMember.getPassword())) {
			result = "不能为空！";
		}
		
		return result;
	}
}
