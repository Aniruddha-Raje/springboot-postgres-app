package com.example.springboot_postgres.service;

import com.example.springboot_postgres.model.AppUser;
import com.example.springboot_postgres.repository.AppUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class AppService {

    @Autowired
    AppUserRepository userRepository;

    @LogExecutionTime
    public List<AppUser> getAllAppUsers(){
        log.info("inside getAllAppUsers");
        return userRepository.findAll();
    }

    @LogExecutionTime
    public Optional<AppUser> getUser(Long id){
        log.info("inside getUser");
        return userRepository.findById(id);
    }

}
