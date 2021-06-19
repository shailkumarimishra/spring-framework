package com.sirt.boot.mvc.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.util.WebUtils;

import com.sirt.boot.mvc.vo.PeriodicUserForm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/wizard")
@SessionAttributes("userForm")
public class WizardController {
	Map<Integer, String> pageForms = new HashMap<>(3);

	@PostConstruct
	public void initialise() {
		pageForms.put(0, "page1");
		pageForms.put(1, "page2");
		pageForms.put(2, "page3");
	}

	@GetMapping
	public String setupForm(Model model) {
		log.info("wizard setup form is started");
		model.addAttribute("userForm", new PeriodicUserForm());
		return "page1";
	}
	
	@PostMapping(params = {"_cancel"})
	public String cancelForm(@RequestParam("_page") int currentPage) {
		log.info("wizard cancel form is started");
		return pageForms.get(currentPage);
	}
	
	@PostMapping(params = {"_finish"})
	public String completeForm(@ModelAttribute("userForm") PeriodicUserForm userForm,SessionStatus status, @RequestParam("_page") int currentPage ) {
		log.info("wizard complete form is started");
		log.info("complete data {}",userForm);
//		TODO call to database
		status.setComplete();
		return "wizardSuccess";
	}
	
	@PostMapping
	public String submitForm(HttpServletRequest request, @ModelAttribute("userForm") PeriodicUserForm userForm,@RequestParam("_page") int currentPage ) {
		log.info("wizard submit form is started");
		int targetPage = getTargetPage(request, currentPage, "_target");
		if(targetPage > currentPage) {
			return pageForms.get(targetPage);
		}
		return pageForms.get(currentPage-1);
	}
	
	private int getTargetPage(HttpServletRequest request,int currentPage,String paramPrefix ) {
		log.info("wizard target form is started");
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String paramName = parameterNames.nextElement();
			if(paramName.startsWith(paramPrefix)) {
				for(int i=0;i<WebUtils.SUBMIT_IMAGE_SUFFIXES.length;i++) {
					String suffix = WebUtils.SUBMIT_IMAGE_SUFFIXES[i];
					if(paramName.endsWith(suffix)) {
						paramName = paramName.substring(0,paramName.length()-suffix.length());
					}
				}
				return Integer.parseInt(paramName.substring(paramPrefix.length()));
			}
		}
		return currentPage;
	}
}








