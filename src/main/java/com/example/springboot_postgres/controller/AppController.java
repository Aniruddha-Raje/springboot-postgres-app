package com.example.springboot_postgres.controller;

import com.example.springboot_postgres.model.User;
import com.example.springboot_postgres.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AppController {

    @Autowired
    AppService service;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllCustomers() {
        System.out.println("getAllCustomers called");
        return new ResponseEntity<>(service.getAllUsers(), HttpStatus.OK);
    }
}
