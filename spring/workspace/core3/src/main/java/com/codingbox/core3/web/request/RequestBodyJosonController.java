package com.codingbox.core3.web.request;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codingbox.core3.web.dto.HelloData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RequestBodyJosonController {
	private ObjectMapper objectMapper= new ObjectMapper();
	
	@PostMapping("/request-body-json-v1")
	public void requestBodyJsonV1(HttpServletRequest request ,HttpServletResponse response) throws IOException {
	ServletInputStream inputStream =request.getInputStream();
	
	String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
	System.out.println("messgeBody: " +messageBody);
	
	HelloData helloData = objectMapper.readValue(messageBody, HelloData.class);
	System.out.println("username: " +helloData.getUsername());
	System.out.println("age: " +helloData.getAge());
	response.getWriter().write("OK");
	}
	/*
	 * @ResponseBody : 응답 메세지
	 */
	@ResponseBody
	@PostMapping("/request-body-json-v2")
	public String requestBodyJsonV2(@RequestBody String messageBody) throws JsonMappingException, JsonProcessingException{
		HelloData data = objectMapper.readValue(messageBody,HelloData.class);
		System.out.println("username: "+data.getUsername());
		System.out.println("age: "+data.getAge());
		
		return "ok";
	}
	/*
	 * @ResponseBody 생략이 불가능
	 * 	->@RequestBody 생략시 @ModelAttribute가 적용되어 버림
	 */
	@ResponseBody
	@PostMapping("/request-body-json-v3")
	public String requestBodyJsonV3(@RequestBody HelloData data) throws JsonMappingException, JsonProcessingException{
		System.out.println("username: "+data.getUsername());
		System.out.println("age: "+data.getAge());
		return "ok";
	}
	
	/* 왜 배열로 가져옴 */
	@ResponseBody
	@PostMapping("/request-body-json-v4")
	public String requestBodyJsonV4(HttpEntity<HelloData> httpEntity) throws JsonMappingException, JsonProcessingException{
		HelloData data = httpEntity.getBody();
		System.out.println("username: "+data.getUsername());
		System.out.println("age: "+data.getAge());
		return "ok";
	}
	/*
	 * @ResponseBody, @RequestBody
	 *  -> 내부적으로 HttpMessageConverter 객체를 사용
	 */
	@ResponseBody
	@PostMapping("/request-body-json-v5")
	public HelloData requestBodyJsonV5(@RequestBody HelloData data) throws JsonMappingException, JsonProcessingException{
		System.out.println("username: "+data.getUsername());
		System.out.println("age: "+data.getAge());
		return data;
	}
}
