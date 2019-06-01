package com.cyp.home.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cyp.home.model.RoomFollow;

@Component
public interface RoomFollowMapper {
	List<RoomFollow> selectRoomFollowByParams(RoomFollow roomFollow);
	
	int addRoomFollow(RoomFollow roomFollow);
}
