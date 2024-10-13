package com.example.springboot_postgres.repository;

import com.example.springboot_postgres.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // Additional query methods (if needed) can be defined here
}
