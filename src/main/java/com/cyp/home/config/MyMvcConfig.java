package com.cyp.home.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cyp.home.Interceptor.LoginHandlerInterceptor;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("views/login");
		registry.addViewController("/loginView.htm").setViewName("views/login");
		registry.addViewController("/admin.htm").setViewName("views/admin");
		registry.addViewController("/getRoomInfoPage.htm").setViewName("views/temp/queryRoomInfoPage");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//注册登陆拦截器
		List<String> excludePath = new ArrayList<>();
		excludePath.add("/loginView.htm");
		excludePath.add("/login.htm");
		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**.htm").excludePathPatterns(excludePath);
	}

	
}
