package com.cyp.home.mapper;

import java.util.List;
import org.springframework.stereotype.Component;
import com.cyp.home.model.RoomInfo;

@Component
public interface RoomInfoMapper {
	List<RoomInfo> selectRoomInfoByPage(RoomInfo roomInfo);
	
	int selectRoomInfoByPage_COUNT(RoomInfo roomInfo);
	
	int addRoomInfo(RoomInfo roomInfo);
}