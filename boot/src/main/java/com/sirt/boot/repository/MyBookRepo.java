package com.sirt.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirt.boot.hibernate.associationmapping.MyBook;

public interface MyBookRepo extends JpaRepository<MyBook, Integer>{

}
