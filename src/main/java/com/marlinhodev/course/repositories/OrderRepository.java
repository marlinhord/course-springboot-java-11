package com.marlinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlinhodev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
