package com.cyp.home.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyp.home.mapper.SysParamsMapper;
import com.cyp.home.model.SysParamsModel;
import com.cyp.home.service.SysParamsService;
@Service
public class SysParamsServiceImpl implements SysParamsService {

	@Autowired
	private SysParamsMapper sysParamsMapper;
	
	@Override
	public SysParamsModel getSysParamsModelByKey(String key) {
		Map<String,Object> param = new HashMap<>();
		param.put("key", key);
		return sysParamsMapper.getSysParamsModel(param);
	}

}
