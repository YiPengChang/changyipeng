package com.cyp.home.utils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cyp.home.model.UserMember;

public class ContextUtils {

	public static String getMemberCode() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();  
		UserMember userMember = (UserMember)request.getSession().getAttribute("loginUser");
		return userMember.getMemberCode();
	}
	
	public static ServletContext getServletContext() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest(); 
		return request.getServletContext();
	}
}
