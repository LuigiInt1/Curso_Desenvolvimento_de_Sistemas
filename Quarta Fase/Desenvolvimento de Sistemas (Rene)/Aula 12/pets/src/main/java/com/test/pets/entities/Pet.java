package com.test.pets.entities;


import com.test.pets.entities.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity

public class Pet {

    @Id
    private Long id;
    private String name;
    private Status status;
    @ManyToOne
    private Adiministrator createdAdm;
    @ManyToOne
    private Order createdOrd;
    @ManyToOne
    private Category createdCat;
    
    
}

