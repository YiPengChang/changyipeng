package com.cyp.home.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cyp.home.model.RoomFollow;
import com.cyp.home.model.RoomInfo;
import com.cyp.home.service.RoomInfoService;

@Controller
public class IndexController {
	@Autowired
	private RoomInfoService roomInfoService;
	
	@ResponseBody
	@RequestMapping(value = {"queryRoomInfoPageJson"})
	public Map<String,Object> easeuiTest(ModelMap modelMap,RoomInfo roomInfo) {
		Map<String,Object> reMap = new HashMap<>(); 
		List<RoomInfo> roomInfoList = roomInfoService.selectRoomInfoByPage(roomInfo);
		reMap.put("rows", roomInfoList);     //存放每页记录数
		reMap.put("total", roomInfoService.selectRoomInfoByPage_COUNT(roomInfo));   //存放总记录数 ，必须的
		return reMap;
	}
	
	@ResponseBody
	@RequestMapping(value = {"addRoomInfo"})
	public String addRoomInfo(RoomInfo roomInfo) throws Exception {
		String result = new String();
		int count = roomInfoService.addRoomInfo(roomInfo);
		if(count == 1) {
			result = "1";
		}else {
			result = "0";
		}
		return result;
	}
	
	//获取房屋详情页面
	@RequestMapping(value = {"getRoom_XiangQing"})
	public String getRoom_XiangQing(ModelMap modelMap,String id) {
		RoomFollow roomFollow = new RoomFollow();
		roomFollow.setRoomId(id);
		List<RoomFollow> roomFollowList = roomInfoService.selectRoomFollowByParams(roomFollow);
		
		//查询房屋信息
		RoomInfo roomInfo = new RoomInfo();
		roomInfo.setId(id);
		List<RoomInfo> roomInfoList = roomInfoService.selectRoomInfoByParams(roomInfo);
		roomInfo = roomInfoList.get(0);
		
		modelMap.addAttribute("roomFollowList", roomFollowList);
		modelMap.addAttribute("roomInfo", roomInfo);
		modelMap.addAttribute("roomId", id);
		return "views/temp/Room_XiangQing";
	}
	
	@ResponseBody
	@RequestMapping(value = {"addRoomFollow"})
	public String addRoomFollow(RoomFollow roomFollow) throws Exception {
		int count = roomInfoService.addRoomFollow(roomFollow);
		return count+"";
	}
	@ResponseBody
	@RequestMapping(value = {"updateRoomInfo"})
	public String updateRoomInfo(RoomInfo roomInfo) throws Exception {
		int count = roomInfoService.updateRoomInfoByParams(roomInfo);
		return count+"";
	}
}
