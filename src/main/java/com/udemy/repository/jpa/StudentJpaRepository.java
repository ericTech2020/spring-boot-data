package com.udemy.repository.jpa;

import com.udemy.entity.Course;
import com.udemy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface StudentJpaRepository extends JpaRepository<Student, Serializable> {


}
