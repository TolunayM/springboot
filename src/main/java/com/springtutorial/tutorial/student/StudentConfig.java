package com.springtutorial.tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student tolunay = new Student(
                    "Tolunay",
                    "tlnymtlu@gmail.com",
                    LocalDate.of(1999, Month.JANUARY,27)

            );

            Student ayca = new Student(
                    "Ayça",
                    "ayca@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY,18)

            );

            repository.saveAll(
                    List.of(tolunay, ayca)
            );
        };
    }
}
