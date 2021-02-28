package com.example.SpringBootDemo.Service.impl;

import com.example.SpringBootDemo.dto.MyRequestDto;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserServiceImpl implements com.example.SpringBootDemo.Service.UserService {
    public UserServiceImpl() {
        System.out.println("Inside UserService constructor..");
    }

    @PostConstruct
    public void init() {
        System.out.println("Inside UserService PostConstructor..");
    }

    @Override
    public boolean updateEmployee(MyRequestDto request, String id) {
        // process...
        System.out.println("inside User Service "+ request + " id " + id);
        return false;
    }

}
