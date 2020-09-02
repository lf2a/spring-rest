package com.lf2a.springdemo.rest;

import com.lf2a.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Luiz", "Filipy"));
        studentList.add(new Student("Maria", "Celina"));
        studentList.add(new Student("Pedro", "José"));
        studentList.add(new Student("Leticia", "Costa"));

        return studentList;
    }
}
