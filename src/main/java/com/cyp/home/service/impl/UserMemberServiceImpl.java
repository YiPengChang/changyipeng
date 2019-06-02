package com.cyp.home.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyp.home.mapper.UserMemberMapper;
import com.cyp.home.model.UserMember;
import com.cyp.home.service.UserMemberService;
@Service
public class UserMemberServiceImpl implements UserMemberService {

	@Autowired
	private UserMemberMapper userMemberMapper;
	
	@Override
	public int addUserMember(UserMember UserMember) {
		return userMemberMapper.addUserMember(UserMember);
	}

	@Override
	public UserMember getUserMemberByparams(UserMember userMember) {
		return userMemberMapper.getUserMemberByparams(userMember);
	}

}
