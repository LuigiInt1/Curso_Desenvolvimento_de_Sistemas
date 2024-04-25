package com.test.pets.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.test.pets.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
