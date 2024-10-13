package com.example.springboot_postgres.service;

import com.example.springboot_postgres.model.AppUser;
import com.example.springboot_postgres.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppService {

    @Autowired
    AppUserRepository userRepository;

    public List<AppUser> getAllAppUsers(){

        return userRepository.findAll();
    }

    public Optional<AppUser> getUser(Long id){

        return userRepository.findById(id);
    }

}
