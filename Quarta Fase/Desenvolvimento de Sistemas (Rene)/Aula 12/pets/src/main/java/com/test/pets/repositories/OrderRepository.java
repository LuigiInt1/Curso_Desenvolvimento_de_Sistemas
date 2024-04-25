package com.test.pets.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.test.pets.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {
    
}
