package com.sirt.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirt.boot.hibernate.associationmapping.Author;

public interface AuthorRepo extends JpaRepository<Author, Integer> {

}
