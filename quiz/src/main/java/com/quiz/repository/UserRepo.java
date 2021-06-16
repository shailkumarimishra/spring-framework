package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.entity.SignIn;

@Repository
public interface UserRepo extends JpaRepository<SignIn,String>{

}
