package com.codingbox.mylogin;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.codingbox.mylogin.filter.LogFilter;
import com.codingbox.mylogin.filter.LoginCheckFilter;
import com.codingbox.mylogin.interceptor.LogInterceptor;
import com.codingbox.mylogin.interceptor.LoginCheckInterceptor;

import jakarta.servlet.Filter;

@Configuration
public class webConfig implements WebMvcConfigurer{
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LogInterceptor())
				.order(1)
				.addPathPatterns("/**")
				.excludePathPatterns("/css/**","/error");

		registry.addInterceptor(new LoginCheckInterceptor())
				.order(2)
				.addPathPatterns("/**")
				.excludePathPatterns("/","memeber/add", "/login","/logout","/css/**","/error");
			
	}
	
//	@Bean
	public FilterRegistrationBean logFilter(){
		FilterRegistrationBean<Filter> filterRegistrationBean= new FilterRegistrationBean<>();
		// 내가 만든 LogFilter를 넣어준다
		filterRegistrationBean.setFilter(new LogFilter());
		filterRegistrationBean.setOrder(1);
		// 모든 url에 다 적용된다.
		filterRegistrationBean.addUrlPatterns("/*");		
		return filterRegistrationBean;
	}
//	@Bean
	public FilterRegistrationBean loginCheckFilter(){
		FilterRegistrationBean<Filter> filterRegistrationBean= new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new LoginCheckFilter());
		filterRegistrationBean.setOrder(2);
		filterRegistrationBean.addUrlPatterns("/*");		
		return filterRegistrationBean;
	}
}
