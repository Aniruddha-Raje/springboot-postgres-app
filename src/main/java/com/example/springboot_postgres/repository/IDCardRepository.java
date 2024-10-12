package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.model.IDCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDCardRepository extends JpaRepository<IDCard, Long> {
    // Additional query methods (if needed) can be defined here
}
