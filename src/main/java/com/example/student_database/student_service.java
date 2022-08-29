package com.example.student_database;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class student_service {

    private final Student_Repo st_repo;

    public List<Student> get_all_students()
    {
        return st_repo.findAll();
    }
}
