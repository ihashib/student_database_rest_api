package com.example.student_database;

import lombok.Data;

@Data
public class Favorite_subjects {
    private int total_subs;
    private String fav_sub_1;
    private String fav_sub_2;
    private String fav_sub_3;

    public Favorite_subjects(int total_subs, String fav_sub_1, String fav_sub_2, String fav_sub_3) {
        this.total_subs = total_subs;
        this.fav_sub_1 = fav_sub_1;
        this.fav_sub_2 = fav_sub_2;
        this.fav_sub_3 = fav_sub_3;
    }
}
