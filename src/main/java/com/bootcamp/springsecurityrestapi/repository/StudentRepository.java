package com.bootcamp.springsecurityrestapi.repository;

import com.bootcamp.springsecurityrestapi.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
