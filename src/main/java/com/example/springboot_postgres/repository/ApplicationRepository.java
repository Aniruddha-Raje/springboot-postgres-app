package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    // Additional query methods (if needed) can be defined here
}
