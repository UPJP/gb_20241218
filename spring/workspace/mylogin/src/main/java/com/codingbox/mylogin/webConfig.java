package com.codingbox.mylogin;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.codingbox.mylogin.filter.LogFilter;
import com.codingbox.mylogin.filter.LoginCheckFilter;

import jakarta.servlet.Filter;

@Configuration
public class webConfig {
	
	@Bean
	public FilterRegistrationBean logFilter(){
		FilterRegistrationBean<Filter> filterRegistrationBean= new FilterRegistrationBean<>();
		// 내가 만든 LogFilter를 넣어준다
		filterRegistrationBean.setFilter(new LogFilter());
		filterRegistrationBean.setOrder(1);
		// 모든 url에 다 적용된다.
		filterRegistrationBean.addUrlPatterns("/*");		
		return filterRegistrationBean;
	}
	@Bean
	public FilterRegistrationBean loginCheckFilter(){
		FilterRegistrationBean<Filter> filterRegistrationBean= new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new LoginCheckFilter());
		filterRegistrationBean.setOrder(2);
		filterRegistrationBean.addUrlPatterns("/*");		
		return filterRegistrationBean;
	}
}
