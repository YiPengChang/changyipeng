package com.cyp.home.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.cyp.home.model.RoomFollow;
import com.cyp.home.model.RoomInfo;
import com.cyp.home.model.RoomInfoExample;

public interface RoomInfoService {
	List<RoomInfo> selectRoomInfoByPage(RoomInfo roomInfo);
	
	List<RoomInfo> selectRoomInfoByParams(RoomInfo roomInfo);
	
	int selectRoomInfoByPage_COUNT(RoomInfo roomInfo);
	
	int addRoomInfo(RoomInfo roomInfo);
	
	int updateRoomInfoByParams(RoomInfo roomInfo);
	
	List<RoomFollow> selectRoomFollowByParams(RoomFollow roomFollow);
	
	int addRoomFollow(RoomFollow roomFollow);
}
