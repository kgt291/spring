package com.nhnent.rookie.sample;



import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
	@Value("${application.message}")
	private String message;
	
	@GetMapping("/")
	public String welcome(Model model) {
		model.addAttribute("time", new Date());
		model.addAttribute("message", this.message);
		return "welcome";
	}
	
	@GetMapping("/helloworld")
	@ResponseBody
	public String helloWorld() {
		return "Hello World!";
	}
}
