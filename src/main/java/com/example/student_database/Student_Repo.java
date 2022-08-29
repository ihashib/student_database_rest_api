package com.example.student_database;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface Student_Repo extends MongoRepository<Student, String>
{
    //Optional<Student> findStudentByStudent_id(String id);
}
