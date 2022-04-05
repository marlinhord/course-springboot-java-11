package com.marlinhodev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marlinhodev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
