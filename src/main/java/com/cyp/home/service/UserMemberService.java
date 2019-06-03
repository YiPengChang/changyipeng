package com.cyp.home.service;

import com.cyp.home.model.UserMember;

public interface UserMemberService {

	public int addUserMember(UserMember userMember);
	
	public UserMember getUserMemberByparams(UserMember userMember);
}
