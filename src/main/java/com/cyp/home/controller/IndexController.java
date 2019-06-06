package com.cyp.home.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.cyp.home.model.ResultJson;
import com.cyp.home.model.RoomFollow;
import com.cyp.home.model.RoomInfo;
import com.cyp.home.model.UserMember;
import com.cyp.home.service.EmailService;
import com.cyp.home.service.RoomInfoService;
import com.cyp.home.service.impl.EmailServiceImpl;
import com.cyp.home.utils.ContextUtils;
import com.cyp.home.utils.DatabaseBackup;

@Controller
public class IndexController {
	private static Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private RoomInfoService roomInfoService;
	
	@Autowired
	EmailService emailService;
	
	@Value("${db.hostIP}")
	String hostIP;
	@Value("${spring.datasource.username}")
	String userName;
	@Value("${spring.datasource.password}")
	String password;
	@Value("${db.savePath}")
	String savePath;
	@Value("${db.fileName}")
	String fileName;
	@Value("${db.databaseName}")
	String databaseName;
	
	@ResponseBody
	@RequestMapping(value = {"queryRoomInfoPageJson.htm"})
	public Map<String,Object> queryRoomInfoPageJson(HttpServletRequest request,ModelMap modelMap,RoomInfo roomInfo) {
		boolean exportDatabaseTool = false;
		try {
			exportDatabaseTool = DatabaseBackup.exportDatabaseTool(hostIP, userName, password, savePath, fileName, databaseName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Map<String,Object> reMap = new HashMap<>(); 
		List<RoomInfo> roomInfoList = roomInfoService.selectRoomInfoByPage(roomInfo);
		reMap.put("rows", roomInfoList);     //存放每页记录数
		reMap.put("total", roomInfoService.selectRoomInfoByPage_COUNT(roomInfo));   //存放总记录数 ，必须的
		return reMap;
	}

	@RequestMapping(value = {"BeiFenMysql.htm"})
	public ResultJson BeiFenMysql(HttpServletRequest request,@RequestParam("password") String password) {
		ResultJson resultJson = new ResultJson();
		if(!"songshiwen123".equals(password)) {
			resultJson.setCode("1");
			resultJson.setMsg("密码错误!");
		}
		boolean exportDatabaseTool = false;
		try {
			exportDatabaseTool = DatabaseBackup.exportDatabaseTool(hostIP, userName, password, savePath, fileName, databaseName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return resultJson;
	}
	
	@ResponseBody
	@RequestMapping(value = {"addRoomInfo.htm"})
	public String addRoomInfo(HttpServletRequest request,RoomInfo roomInfo) throws Exception {
		String result = "";
		HttpSession session = request.getSession();
		UserMember userMember = (UserMember)session.getAttribute("loginUser");

		//校验
		String vaildAddRoomInfo = roomInfoService.vaildAddRoomInfo(roomInfo);
		if(!StringUtils.isEmpty(vaildAddRoomInfo)) {
			result = vaildAddRoomInfo;
			return result;
		}
		roomInfo.setMemberCode(userMember.getMemberCode());
		roomInfo.setRealName(userMember.getRealName());
		int count = roomInfoService.addRoomInfo(roomInfo);
		if(count != 1) {
			result = "添加失败";
		}
		result = "seccess";
		return result;
	}
	
	//获取房屋详情页面
	@RequestMapping(value = {"getRoom_XiangQing.htm"})
	public String getRoom_XiangQing(HttpServletRequest request,ModelMap modelMap,String id) {
		RoomFollow roomFollow = new RoomFollow();
		roomFollow.setRoomId(id);
		List<RoomFollow> roomFollowList = roomInfoService.selectRoomFollowByParams(roomFollow);
		
		//查询房屋信息
		RoomInfo roomInfo = new RoomInfo();
		roomInfo.setId(id);
		List<RoomInfo> roomInfoList = roomInfoService.selectRoomInfoByParams(roomInfo);
		roomInfo = roomInfoList.get(0);
		if(!ContextUtils.getMemberCode().equals(roomInfo.getMemberCode()) ){
			roomInfo.setLock("1");
			String ownerMobile = roomInfo.getOwnerMobile();
			if(!StringUtils.isEmpty(ownerMobile) && ownerMobile.length() == 11) {
				roomInfo.setOwnerMobile(ownerMobile.substring(0,3)+ "*****"+ownerMobile.substring(8,11));
			}
		}
		modelMap.addAttribute("roomFollowList", roomFollowList);
		modelMap.addAttribute("roomInfo", roomInfo);
		modelMap.addAttribute("roomId", id);
		return "views/temp/Room_XiangQing";
	}
	
	@ResponseBody
	@RequestMapping(value = {"addRoomFollow.htm"})
	public ResultJson addRoomFollow(HttpServletRequest request,RoomFollow roomFollow) throws Exception {
		ResultJson resultJson = new ResultJson();
		
		roomFollow.setMemberCode(ContextUtils.getMemberCode());
		String content = roomFollow.getContent();
		if(StringUtils.isEmpty(content)) {
			resultJson.setCode("2");
			resultJson.setMsg("不能输入空！");
			return resultJson;
		}
		int count = roomInfoService.addRoomFollow(roomFollow);
		resultJson.setCode("1");
		return resultJson;
	}
	@ResponseBody
	@RequestMapping(value = {"updateRoomInfo.htm"})
	public ResultJson updateRoomInfo(RoomInfo roomInfo) throws Exception {
		ResultJson resultJson = new ResultJson();
		//校验
		String vaildAddRoomInfo = roomInfoService.vaildAddRoomInfo(roomInfo);
		if(!StringUtils.isEmpty(vaildAddRoomInfo)) {
			resultJson.setCode("1");
			resultJson.setMsg(vaildAddRoomInfo);
			return resultJson;
		}
		int count = roomInfoService.updateRoomInfoByParams(roomInfo);
		if(count == 1) {
			resultJson.setCode("0");
			resultJson.setMsg("修改成功");
			return resultJson;
		}
		return resultJson;
	}
	
	
	

}
