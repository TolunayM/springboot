package com.springtutorial.tutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Data access repo
@Repository
public interface StudentRepository
        extends JpaRepository<Student,Long> {
}
