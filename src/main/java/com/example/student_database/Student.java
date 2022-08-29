package com.example.student_database;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Student {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private address addr;
    @Indexed(unique = true)
    private String student_id;
    private Gender gender;
    private Favorite_subjects fav_subs;
    private int spend_on_books;
    private LocalDateTime created;

    public Student(String first_name, String last_name, String email, address addr,
                   String student_id, Gender gender, Favorite_subjects fav_subs,
                   int spend_on_books, LocalDateTime created) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.addr = addr;
        this.student_id = student_id;
        this.gender = gender;
        this.fav_subs = fav_subs;
        this.spend_on_books = spend_on_books;
        this.created = created;
    }
}
