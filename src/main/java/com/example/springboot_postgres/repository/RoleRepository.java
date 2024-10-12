package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // Additional query methods (if needed) can be defined here
}
