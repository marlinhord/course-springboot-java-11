package com.marlinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlinhodev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
