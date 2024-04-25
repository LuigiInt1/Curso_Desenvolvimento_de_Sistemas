package com.test.pets.entities;


import com.test.pets.entities.enums.Office;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@NoArgsConstructor 
@Entity
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Adiministrator extends User {

    private Boolean IsAdmin;
    private Office office;
    
}

