package com.cyp.home.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.cyp.home.mapper.RoomFollowMapper;
import com.cyp.home.mapper.RoomInfoMapper;
import com.cyp.home.model.RoomFollow;
import com.cyp.home.model.RoomInfo;
import com.cyp.home.model.RoomInfoExample;
import com.cyp.home.service.RoomInfoService;
import com.cyp.home.utils.VaildUtils;
@Service
public class RoomInfoServiceImpl implements RoomInfoService {

	@Autowired
	private RoomInfoMapper roomInfoMapper;
	@Autowired
	private RoomFollowMapper roomFollowMapper;
	
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
		roomInfo.setId(UUID.randomUUID().toString());
		return roomInfoMapper.addRoomInfo(roomInfo);
	}

	@Override
	public List<RoomFollow> selectRoomFollowByParams(RoomFollow roomFollow) {
		return roomFollowMapper.selectRoomFollowByParams(roomFollow);
	}

	@Override
	public int addRoomFollow(RoomFollow roomFollow) {
		roomFollow.setId(UUID.randomUUID().toString());
		return roomFollowMapper.addRoomFollow(roomFollow);
	}

	@Override
	public List<RoomInfo> selectRoomInfoByParams(RoomInfo roomInfo) {
		return roomInfoMapper.selectRoomInfoByParams(roomInfo);
	}

	@Override
	public int updateRoomInfoByParams(RoomInfo roomInfo) {
		return roomInfoMapper.updateRoomInfoByParams(roomInfo);
	}

	@Override
	public String vaildAddRoomInfo(RoomInfo roomInfo) {
		String result = "";
		if(StringUtils.isEmpty(roomInfo.getAddress()) || 
				StringUtils.isEmpty(roomInfo.getArea()) ||
				StringUtils.isEmpty(roomInfo.getDecoration()) ||
				StringUtils.isEmpty(roomInfo.getElectricityFee()) ||
				StringUtils.isEmpty(roomInfo.getEstateFee()) ||
				StringUtils.isEmpty(roomInfo.getEstateName()) ||
				StringUtils.isEmpty(roomInfo.getFloorNum()) ||
				StringUtils.isEmpty(roomInfo.getHomeStatus()) ||
				StringUtils.isEmpty(roomInfo.getHomeUse()) ||
				StringUtils.isEmpty(roomInfo.getOriented()) ||
				StringUtils.isEmpty(roomInfo.getOwnerMobile()) ||
				StringUtils.isEmpty(roomInfo.getPrice()) ||
				StringUtils.isEmpty(roomInfo.getRegion()) ||
				StringUtils.isEmpty(roomInfo.getRoomNumber()) ||
				StringUtils.isEmpty(roomInfo.getPayWay())   ||
				StringUtils.isEmpty(roomInfo.getParkingFee())  ) {
			result = "不能为空";
			return result; 
		}
		
		if(!VaildUtils.isNum(roomInfo.getOwnerMobile())) {
			result = "手机号不合法";
			return result; 
		}
		return null;
	}



}
