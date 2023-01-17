package com.springtutorial.tutorial;

import com.springtutorial.tutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello(){
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
