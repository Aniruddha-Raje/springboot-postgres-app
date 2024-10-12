package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    // Additional query methods (if needed) can be defined here
}
