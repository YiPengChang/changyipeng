package com.cyp.home.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.cyp.home.model.RoomInfo;
import com.cyp.home.model.RoomInfoExample;

public interface RoomInfoService {
	List<RoomInfo> selectRoomInfoByPage(RoomInfo roomInfo);
	
	int selectRoomInfoByPage_COUNT(RoomInfo roomInfo);
	
	int addRoomInfo(RoomInfo roomInfo);
	
}
