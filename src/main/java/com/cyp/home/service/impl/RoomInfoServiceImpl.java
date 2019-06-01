package com.cyp.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.cyp.home.mapper.RoomInfoMapper;
import com.cyp.home.model.RoomInfo;
import com.cyp.home.model.RoomInfoExample;
import com.cyp.home.service.RoomInfoService;
@Service
public class RoomInfoServiceImpl implements RoomInfoService {

	@Autowired
	private RoomInfoMapper roomInfoMapper;
	
	@Override
	public List<RoomInfo> selectRoomInfoByPage(RoomInfo roomInfo) {
		return  roomInfoMapper.selectRoomInfoByPage(roomInfo);
	}

	@Override
	public int selectRoomInfoByPage_COUNT(RoomInfo roomInfo) {
		return roomInfoMapper.selectRoomInfoByPage_COUNT(roomInfo);
	}

	@Override
	public int addRoomInfo(RoomInfo roomInfo) {
		return roomInfoMapper.addRoomInfo(roomInfo);
	}


}
