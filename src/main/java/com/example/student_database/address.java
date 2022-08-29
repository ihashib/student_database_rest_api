package com.example.student_database;

import lombok.Data;

@Data
public class address {
    private String street_addr;
    private String house_num;
    private String city;
    private String post_code;

    public address(String street_addr, String house_num, String city, String post_code) {
        this.street_addr = street_addr;
        this.house_num = house_num;
        this.city = city;
        this.post_code = post_code;
    }
}
