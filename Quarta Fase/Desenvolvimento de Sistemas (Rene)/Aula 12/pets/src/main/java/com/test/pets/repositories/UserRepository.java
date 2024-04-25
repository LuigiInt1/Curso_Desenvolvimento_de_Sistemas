package com.test.pets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.pets.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
