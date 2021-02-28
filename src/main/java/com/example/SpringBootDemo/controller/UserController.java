package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.Service.UserService;
import com.example.SpringBootDemo.dto.MyRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.PostConstruct;

public class UserController {
    public UserController(UserService userService) {
        this.userService = userService;
        System.out.println("Inside UserController constructor..");

    }

    @PostConstruct
    public void init () {
        System.out.println("inside UserController post construct..");
    }

    @Autowired
    private UserService userService;

    // [POST] /update/employee/{id}
    // {"firstName": ".." ...} MyRequestDTO
    // boolean true/false
    @PostMapping(path = "/update/employee/{id}")
    public boolean updateEmployee(@PathVariable String id,
                                  @RequestBody MyRequestDto request) {
        return userService.updateEmployee(request, id);
    }
}
