package com.cyp.home.Interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.util.StringUtils;
import com.cyp.home.utils.Utils;

/**
 * 登录连接器
 * @author uinpay
 *
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object user = request.getSession().getAttribute("loginUser");
		Enumeration<String> attributeNames = request.getSession().getAttributeNames();
		while(attributeNames.hasMoreElements()) {
			String nextElement = attributeNames.nextElement();
			System.out.println(nextElement);
		}
		if(user == null) {
			request.setAttribute("msg", "没有权限请先登陆");
			request.getRequestDispatcher("/loginView.htm").forward(request, response);
			return false;
		}else {
			//已登录，放行请求
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
