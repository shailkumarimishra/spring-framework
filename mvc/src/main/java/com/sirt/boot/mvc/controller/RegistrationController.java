package com.sirt.boot.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sirt.boot.mvc.exception.RecordNotFoundException;
import com.sirt.boot.mvc.vo.Registration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/registration")
public class RegistrationController {
	@GetMapping
	public String setupRegistration(Model model) {
		log.info("setup registration method is started");
		model.addAttribute("registration", new Registration());
		String[] genders = { "Male", "Female" };
		model.addAttribute("genders", genders);
		List<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("Servlet");
		courses.add("Jsp");
		courses.add("Jdbc");
		model.addAttribute("courseList", courses);
		String[] timings = { "7am to 9am", "7pm to 9pm" };
		model.addAttribute("timings", timings);
		return "registration";
	}

	@PostMapping
	public String submitForm(@ModelAttribute("registration") @Valid Registration registration,
			BindingResult bindingResult, Model model) throws RecordNotFoundException {
		log.info("registration data{}", registration);
		if (bindingResult.hasErrors()) {
//			model.addAttribute("registration", new Registration());
			String[] genders = { " Male", " Female" };
			model.addAttribute("genders", genders);
			List<String> courses = new ArrayList<>();
			courses.add("Java");
			courses.add("Servlet");
			courses.add("Jsp");
			courses.add("Jdbc");
			model.addAttribute("courseList", courses);
			String[] timings = { "7am to 9am", "7pm to 9pm" };
			model.addAttribute("timings", timings);
			return "registration";
		} else {
			model.addAttribute("fullName", registration.getFirstName() + " " + registration.getLastName());
			throw new RecordNotFoundException();
//			return "regsuccess";
		}
	}
}
