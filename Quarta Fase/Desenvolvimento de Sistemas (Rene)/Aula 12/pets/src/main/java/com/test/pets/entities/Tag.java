package com.test.pets.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity

public class Tag {

    @Id
    private Long id;
    private String name;
    @ManyToMany
    private List <Pet> pets;

}

