package com.sirt.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirt.boot.hibernate.associationmapping.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
