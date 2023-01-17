package com.springtutorial.tutorial.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Tolunay",
                        "tlnymtlu@gmail.com",
                        LocalDate.of(1999, Month.JANUARY,27),
                        24
                )
        );
    }
}
