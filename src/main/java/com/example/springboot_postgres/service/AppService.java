package com.example.springboot_postgres.service;

import com.example.springboot_postgres.model.User;
import com.example.springboot_postgres.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){

        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id){

        return userRepository.findById(id);
    }

}
