package com.petproject.notificator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petproject.notificator.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}