package com.udemy.repository.jpa;

import com.udemy.entity.Review;
import com.udemy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ReviewJpaRepository extends JpaRepository<Review, Serializable> {


}
