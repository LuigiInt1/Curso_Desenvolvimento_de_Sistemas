package com.test.pets.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity

public class Category {

    @Id
    private Long id;
    private String name;
    
}

