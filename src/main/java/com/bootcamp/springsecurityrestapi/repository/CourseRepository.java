package com.bootcamp.springsecurityrestapi.repository;

import com.bootcamp.springsecurityrestapi.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
