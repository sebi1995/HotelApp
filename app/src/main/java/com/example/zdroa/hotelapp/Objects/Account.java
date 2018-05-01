package com.example.zdroa.hotelapp.Objects;

public class Account {

    private Integer personal_id;
    private String username, password, first_name, last_name;

    Account(Integer personal_id, String username, String password, String first_name, String last_name){
        this.personal_id = personal_id;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
    }

}
