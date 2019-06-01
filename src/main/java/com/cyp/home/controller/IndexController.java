package com.cyp.home.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cyp.home.model.ResultJson;
import com.cyp.home.model.RoomInfo;
import com.cyp.home.model.RoomInfoExample;
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
	
	
}
