package com.sirt.boot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sirt.boot.mvc.vo.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {
	@PostMapping
//	@RequestMapping()
	public String submitForm(@ModelAttribute("user") User user, ModelMap model) {
		log.info("user emailId {} and password {}", user.getEmailId(), user.getPassword());
		model.put("user", user);
		return "formSubmitSuccess";
	}
	@GetMapping
	public String setupForm(Model model) {
		log.info("****** login controller");
		model.addAttribute("user",new User());
		return "login";
	}
}
