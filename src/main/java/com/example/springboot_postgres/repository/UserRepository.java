package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods (if needed) can be defined here
}
