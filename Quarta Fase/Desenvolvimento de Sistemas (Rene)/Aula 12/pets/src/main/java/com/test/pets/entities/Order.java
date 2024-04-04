package com.test.pets.entities;

import java.time.LocalDateTime;

import com.test.pets.entities.enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "order_table")

public class Order {
    @Id
    private Long id;
    private Integer quantity;
    private LocalDateTime shipDate;
    private OrderStatus status;
    private Boolean completa;

}
