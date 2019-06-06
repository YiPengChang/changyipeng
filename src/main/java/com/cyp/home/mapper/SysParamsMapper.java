package com.cyp.home.mapper;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.cyp.home.model.SysParamsModel;
@Component
public interface SysParamsMapper {
	public SysParamsModel getSysParamsModel(Map<String,Object> param);
}
