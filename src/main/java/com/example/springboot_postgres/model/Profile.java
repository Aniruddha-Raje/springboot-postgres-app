package com.example.springboot_postgres.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bio;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "app_user_id", unique = true)
    private AppUser appUser;
}
