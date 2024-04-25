package com.test.pets.dtos.users;

import com.test.pets.entities.enums.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor @Data
public class UserOutput {
  
    private Long id;
    private String username;
    private String firstName;
    private String lasName;
    private String email;
    private UserStatus userStatus;
}
