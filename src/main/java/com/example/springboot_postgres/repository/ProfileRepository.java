package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // Additional query methods (if needed) can be defined here
}
