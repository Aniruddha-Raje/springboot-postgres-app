package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    // Additional query methods (if needed) can be defined here
}
