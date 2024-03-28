package com.codingbox.core3.web.request;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codingbox.core3.web.dto.HelloData;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ReuestParamController {

	//반환 타입이 없으면서 응답값을 직접입력하면, view 조회하지 않는다.
	//void타입이면서 response에 값을 쓰면, 쓴 값이 화면에 보이게 된다.
	@RequestMapping("/request-param-v1")
	public void requestparamV1(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		
		String username = request.getParameter("username");
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println("username: "+username);
		System.out.println("age: "+age);
		response.getWriter().write("OK");
		
	}
	/*
	 * @ResponseBody
	 *   - view 조회를 무시하고, HTTP message body에 직접 해당 내용 입력
	 *   -------------------------------------------------------
	 * @RequestParam
	 * 	 - 파라미터 이름으로 바인딩  
	 */
	@ResponseBody
	@RequestMapping("/request-param-v2")
	public String requestparamV2(@RequestParam(name="username")String memberName,
								 @RequestParam("age") int memberAge) {
		System.out.println("username: "+ memberName);
		System.out.println("age: "+ memberAge);
		return "Ok";
	}
	/*
	 * @RequestParam 사용
	 *  HTTP 파라미터 이름이 변수 이름과 같으면
	 *  @RequestParam(name="...") 생략 가능
	 */
	@ResponseBody
	@RequestMapping("/request-param-v3")
	public String requestparamV3(@RequestParam String username,
								 @RequestParam int age) {
		System.out.println("username: "+ username);
		System.out.println("age: "+ age);
		return "Ok";
	}
	
	/*
	 * @RequestParam 생략가능
	 *  -> String, int 등과 같은 단순 타입이면  생략가능
	 *  -----------------------------------------
	 *  - 이방법은 권장하진 않는다.
	 *  -> @RequestParam 있으면 명확하게 요청 파라미터에서 데이터를
	 *     읽어온다는 것을 알수 있다.
	 */
	@ResponseBody
	@RequestMapping("/request-param-v4")
	public String requestparamV4(String username, int age) {
		System.out.println("username: "+ username);
		System.out.println("age: "+ age);
		return "Ok";
	}
	/*
	 * @RequestParam.required 옵션
	 *  - 기본값은 true이다.
	 *  - /required-param-required	-> username이 없으므로 예외
	 *  - /required-param-required?username	-> 빈 문자로 통과
	 *  - /required-param-required	-> int age 주의 null값 대체 때문에 Interger defaultValue 사용
	 */
	@ResponseBody
	@RequestMapping("/request-param-required")
	public String requestparamRequired(
			@RequestParam(required = true)String username,
			@RequestParam(required = false)Integer age) {
		System.out.println("username: "+ username);
		System.out.println("age: "+ age);
		return "Ok";
	}
	/*
	 * @RequestParam
	 *  - defaultValue 옵션 사용시
	 *  	->기본값 세팅
	 *  	-> 빈 문자열인 경우에도 적용
	 *  	-> 이미 기본값이 세팅이 되었기 때문에 required옵션이 의미가 없다.
	 */
	@ResponseBody
	@RequestMapping("/request-param-default")
	public String requestparamDefault(
			@RequestParam(required = true,defaultValue="guest")String username,
			@RequestParam(required = false,defaultValue="-1")int age) {
		System.out.println("username: "+ username);
		System.out.println("age: "+ age);
		return "Ok";
	}
	
	@ResponseBody
	@RequestMapping("/request-param-map")
	public String requestparamMap(@RequestParam Map<String,Object>paramMap) {
		System.out.println("username: "+ paramMap.get("username"));
		System.out.println("age: "+ paramMap.get("age"));
		return "Ok";
	}
	
	@ResponseBody
	@RequestMapping("/request-param-attribute-v1")
	public String requestparamAttributeV1(@RequestParam String username,
			@RequestParam int age) {
		HelloData helloData = new HelloData();
		helloData.setUsername(username);
		helloData.setAge(age);
		
		System.out.println("username :" +helloData.getUsername());
		System.out.println("age :" +helloData.getAge());
		return "Ok";
	}
	/*
	 * @ModelAttribute 사용
	 */
	@ResponseBody
	@RequestMapping("/request-param-attribute-v2")
	public String requestparamAttributeV2(@ModelAttribute HelloData helloData) {
		System.out.println("username :" + helloData.getUsername());
		System.out.println("age :" + helloData.getAge());
		System.out.println("hellodata : " + helloData.toString());
		return "Ok";
	}
	
	/*
	 * @ModelAttribute, @RequestParam 생략가능
	 *  - 혼란이 발생할 수 있다
	 *  - String, int, Integer, ... 단순 타입이면 ->
	 *  	@RequestParam이 생략 되었다고 판다
	 *  - DTO객체가 파라미터에 있으면 ->
	 *  	@ModelAttribute이 생략 되었다고 판다
	 */
	@ResponseBody
	@RequestMapping("/request-param-attribute-v3")
	public String requestparamAttributeV3(HelloData helloData) {
		System.out.println("username :" + helloData.getUsername());
		System.out.println("age :" + helloData.getAge());
		System.out.println("hellodata : " + helloData.toString());
		return "Ok";
	}
}
