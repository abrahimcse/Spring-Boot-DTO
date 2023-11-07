package com.abrahim.Spring.Boot.DTO.repository;

import com.abrahim.Spring.Boot.DTO.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
