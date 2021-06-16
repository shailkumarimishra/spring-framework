package com.sirt.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sirt.boot.hibernate.associationmapping.Review;

public interface ReviewRepo extends JpaRepository<Review, Integer>{

}
