package ccom.codingbox.core.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data","firstData");
		return "hello";
		
	}
	/*
	 * url : get 방식
	 * 		/hello-mvc
	 * data: key : name , value : userName
	 * 화면 : hello-tmpleate.html(name 데이터 출력)
	 */
	
	@GetMapping("hello-mvc")
	public String helloMvc(@RequestParam(value="name",
										required = false, 
										defaultValue = "required test") String name, Model model) {
	model.addAttribute("name",name);
	return "hello-tmpleate";

	}
}
