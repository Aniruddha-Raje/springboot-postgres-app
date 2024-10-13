package com.example.springboot_postgres.controller;

import com.example.springboot_postgres.model.AppUser;
import com.example.springboot_postgres.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class AppController {

    @Autowired
    AppService service;

    @GetMapping("/all")
    public ResponseEntity<List<AppUser>> getAllAppUsers() {
        System.out.println("getAllAppUsers called");
        return new ResponseEntity<>(service.getAllAppUsers(), HttpStatus.OK);
    }

    @GetMapping("/id/{appUserId}")
    public ResponseEntity<AppUser> getAllCustomers(@PathVariable String appUserId) {
        System.out.println("getAppUser called");
        return new ResponseEntity<>(service.getUser(Long.valueOf(appUserId)).get(), HttpStatus.OK);
    }
}
