package com.cyp.home.model;

import java.io.Serializable;
/**
 * 系统配置表
 * @author Administrator
 *
 */
public class SysParamsModel implements Serializable{

	private static final long serialVersionUID = -8818742755685062639L;

	private String key;
	
	private String keyValue;
	
	private String keyGroup;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getKeyGroup() {
		return keyGroup;
	}

	public void setKeyGroup(String keyGroup) {
		this.keyGroup = keyGroup;
	}

	@Override
	public String toString() {
		return "SysParamsModel [key=" + key + ", keyValue=" + keyValue + ", keyGroup=" + keyGroup + "]";
	}
	
	
}
