package com.test.pets.dtos.users;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor @Data
public class UserInput {
    private String username;
    private String firstName;
    private String lasName;
    private String email;
    private String password;
    private String phone;
    
}
