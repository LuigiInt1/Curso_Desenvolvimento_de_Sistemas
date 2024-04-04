package com.test.pets.entities;

import org.springframework.boot.autoconfigure.ssl.SslBundleProperties.Key;

import com.test.pets.entities.enums.UserStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity

public class User {

    @Id
    private Long id;
    private String username;
    private String firstName;
    private String lasName;
    private String email;
    private String password;
    private String phone;
    private UserStatus userStatus;

}

