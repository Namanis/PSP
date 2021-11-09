package com.example.PSP3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class WelcomeController {
	

	@GetMapping("/")
	public String showRootPage(ModelMap model) {
		model.put("name", "ANONYMOUS");
		return "welcome";
	}
	

	@GetMapping("/welcome")
	public String showWelcomePage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "welcome";
	}
	

	@GetMapping("/welcomeResponseBody") 			
	@ResponseBody
	public String showWelcomeResponseBodyPage() {
		return "Laba diena su vištiena.";
	}
}
