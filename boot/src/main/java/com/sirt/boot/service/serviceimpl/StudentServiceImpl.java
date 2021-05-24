package com.sirt.boot.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirt.boot.entity.StudentEntity;
import com.sirt.boot.repository.StudentRepo;
import com.sirt.boot.service.StudentService;
import com.sirt.boot.vo.Student;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepo repo;
	@Override
	public List<Student> getALLStudent() {
		List<StudentEntity> students = repo.findAll();
		log.info("fetching students from DB {}",students);
//		convert entity to value object
		List<Student> stuList=new ArrayList<>();
		for(StudentEntity entity:students) {
			Student stu=new Student();
			stu.setName(entity.getName());
			stu.setSid(entity.getSid());
			stu.setPhoneNo(entity.getPhoneNo());
			stu.setEmail(entity.getEmail());
			stuList.add(stu);
		}
		return stuList;
	}

	@Override
	public Student getStudentById(int sid) {
		StudentEntity entity = repo.findById(sid).get();
		Student stu=new Student();
		stu.setName(entity.getName());
		stu.setSid(entity.getSid());
		stu.setPhoneNo(entity.getPhoneNo());
		stu.setEmail(entity.getEmail());
		return stu;
	}

}
