package com.cyp.home.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cyp.home.Interceptor.LoginHandlerInterceptor;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("views/index");
		registry.addViewController("/index").setViewName("views/index");
		registry.addViewController("/login").setViewName("views/login");
		registry.addViewController("/admin").setViewName("views/admin");
		registry.addViewController("/getRoomInfoPage").setViewName("views/temp/queryRoomInfoPage");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//注册登陆拦截器
//		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
	}

	
}
