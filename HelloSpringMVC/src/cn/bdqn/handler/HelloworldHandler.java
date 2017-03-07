package cn.bdqn.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldHandler {
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
		
	}
}
