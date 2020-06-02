package com.udemy.repository;

import com.udemy.SpringBootDataApplication;
import com.udemy.entity.Course;
import com.udemy.entity.Review;
import com.udemy.repository.jpa.ReviewJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringBootDataApplication.class)
public class CourseJpaRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseJpaRepository repository;

    @Autowired
    ReviewJpaRepository reviewJpaRepository;

    @Test
    public void findById_basic() {
        List<Object[]>  result = repository.courseWithStudent();
        logger.info(  Integer.toString(result.size()) );
        //assertEquals("JPA in 50 Steps", coresulktrse.getName());
    }

    @Test
    public void findMinId(){
       logger.info( Long.toString( repository.findMinId()));
    }

    @Test
    public void findCourse(){
     Optional<Course> course=   repository.findCourse(10001L);
     assertNotNull(course);
    }

    @Test
    public void saveCourse()
    {
        Optional<Course> course =repository.findCourse(10003L);
        if (course.isPresent()) {

            Optional<Review> review= reviewJpaRepository.findById(50001L);
            course.ifPresent(course2 -> {
                course2.setName("Spring Boot in 100 Steps test1000");
                List<Review> reviews=course2.getReviews();
                reviews.add(review.get());
                repository.save(course2);
            });
        }
    }
}