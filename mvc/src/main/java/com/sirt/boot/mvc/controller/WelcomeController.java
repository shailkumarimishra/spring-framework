package com.sirt.boot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping(path = "/")
	public String greeting(ModelMap model) {
		model.put("name", "Shail Mishra");
		return "welcome";
	}
}
