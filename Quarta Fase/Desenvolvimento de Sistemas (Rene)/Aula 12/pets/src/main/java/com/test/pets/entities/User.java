package com.test.pets.entities;


import com.test.pets.entities.enums.UserStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String firstName;
    private String lasName;
    @Column(unique = true)
    private String email;
    private String password;
    private String phone;
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

   }

