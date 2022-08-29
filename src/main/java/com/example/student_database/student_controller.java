package com.example.student_database;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class student_controller {
    private final student_service st_service;

    @GetMapping
    public List<Student> fetchAllStudents()
    {
        return st_service.get_all_students();
    }
}
