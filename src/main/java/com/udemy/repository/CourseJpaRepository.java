package com.udemy.repository;

import com.udemy.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CourseJpaRepository extends JpaRepository<Course, Serializable> {


    //JPQL
    @Query("Select c, s from Course c JOIN c.students s where s.id=:studentId ")
    List<Object[]>  courseStudentWithParameter(@Param(value="studentId") Long studentId);

    @Query("Select c from Course c where c.id=?1")
    Optional<Course> findCourse(Long courseId);


    @Query("Select c, s from Course c JOIN c.students s ")
    List<Object[]>  courseWithStudent();

    @Query("Select c, s from Course c JOIN Student s ")
    List<Object[]>  courseWithStudent1();


    @Query(value = "select MIN(id) from course", nativeQuery = true)
    public Long findMinId();
}
