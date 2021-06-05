package com.sirt.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sirt.boot.hibernate.inheritancemapping.WeekDayStudent;
import com.sirt.boot.repository.TablePerSubClassRepo;

@RestController
@RequestMapping("/hibernate")
public class HibernateController {
	@Autowired
	private TablePerSubClassRepo tpscRepo;
	@GetMapping(path="/tpsc")
	public String tpscMapping() {
		WeekDayStudent wds = new WeekDayStudent(1, "Anu", "Bhopal", "weekdaystudent", 7000, 2000, " 7am to 9 am", "CSE", "BE", 80, 2017);
	    tpscRepo.save(wds);
		return "tpscmapping";
	}

}
