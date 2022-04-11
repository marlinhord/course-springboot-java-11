package com.marlinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlinhodev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
