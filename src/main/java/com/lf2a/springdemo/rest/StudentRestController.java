package com.lf2a.springdemo.rest;

import com.lf2a.springdemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> studentList;

    @PostConstruct
    public void loadData() {
        studentList = new ArrayList<>();

        studentList.add(new Student("Luiz", "Filipy"));
        studentList.add(new Student("Maria", "Celina"));
        studentList.add(new Student("Pedro", "José"));
        studentList.add(new Student("Leticia", "Costa"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList;
    }
}
