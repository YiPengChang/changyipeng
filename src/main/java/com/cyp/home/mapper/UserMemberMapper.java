package com.cyp.home.mapper;

import org.springframework.stereotype.Component;

import com.cyp.home.model.UserMember;
@Component
public interface UserMemberMapper {

	public int addUserMember(UserMember UserMember);
	
	public UserMember getUserMemberByparams(UserMember userMember);
}
