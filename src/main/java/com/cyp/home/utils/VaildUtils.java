package com.cyp.home.utils;

import java.util.regex.Pattern;

import com.alibaba.druid.util.StringUtils;

public class VaildUtils {
	public static boolean isNum(String str) {
		if(StringUtils.isEmpty(str)) {
			return false;
		}
		String reg = "^[0-9]+(.[0-9]+)?$";

        return str.matches(reg);
	}
	
	public static boolean isEmail(String email) {
		if(StringUtils.isEmpty(email)) {
			return false;
		}
		String reg="[A-z]+[A-z0-9_-]*\\@[A-z0-9]+\\.[A-z]+";
		return email.matches(reg);
	}
}
