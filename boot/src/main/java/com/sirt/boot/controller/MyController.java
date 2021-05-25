package com.sirt.boot.controller;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sirt.boot.service.StudentService;
import com.sirt.boot.vo.Student;

import lombok.extern.slf4j.Slf4j;
/**
 * Important MVC Annotations :-
 * 1. @RestController
 * 2. @Controller
 * 3. @RequestMapping
 * 4. @GetMapping
 * 5. @PostMapping
 * 6. @PutMapping
 * 7. @PathVariable
 * 8. @RequestBody
 * 9. @QueryString
 *10. @ResponseBody
 *
 * @author Shail Mishra
 *
 */
@Slf4j
@RestController
public class MyController {
	@Autowired
	private StudentService service;
	@GetMapping("/greetings")
	public String greetings() {
		return "Welcome To Spring Boot Application";
	}

	@GetMapping(path="/students",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> stuList = service.getALLStudent();
		log.info("all student info: {}",stuList);
		return	new ResponseEntity<>(stuList,HttpStatus.OK);
	}
	@GetMapping(path="/students/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int sid){
		Student student = service.getStudentById(sid);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
//	@RequestMapping(value="/student/{id}",method=RequestMethod.GET,produces="application/json")
	@GetMapping(path="/student/{id}",produces=MediaType.APPLICATION_XML_VALUE)
	public Student getStudent(@PathVariable("id") int sid){
		Student student = service.getStudentById(sid);
		return student;
	}
@PostMapping(path="/students/save")
public String saveStudent(@RequestBody Student stu) {
	log.info("student data {}",stu);
	service.save(stu);
	return "student saved successfully";
}
@PostMapping(path="/students/saveall")
public String saveAllStudent(@RequestBody List<Student> stuList) {
	log.info("student data {}",stuList);
	service.save(stuList);
	return "All students saved successfully";
}
@DeleteMapping(path="/students/{id}")
public String deleteStudent(@PathVariable("id") int sid) {
	log.info("student data {}",sid);
	service.deleteById(sid);
	return "Student id= "+sid+" deleted successfully";
}
@PutMapping(path="/students/update")
public String updateStudent(@RequestBody Student stu) {
	log.info("student data {}",stu);
	service.updateRecord(stu);
	return "Student id= "+stu.getSid()+" data updated";
}
}
