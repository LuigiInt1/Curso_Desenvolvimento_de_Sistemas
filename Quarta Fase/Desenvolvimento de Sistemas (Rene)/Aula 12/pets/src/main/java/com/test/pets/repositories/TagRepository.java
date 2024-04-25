package com.test.pets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.pets.entities.Tag;

public interface TagRepository extends JpaRepository <Tag, Long> {
    
}
