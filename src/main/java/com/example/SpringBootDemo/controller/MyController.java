package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.dto.MyRequestDto;
import com.example.SpringBootDemo.dto.MyResponseDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "success!!!";
    }

    //@PutMapping
    //@DeleteMapping
    @PostMapping(path = "/hello-post")
    public String helloWorldPost() {
        return "success-post!!";
    }

    @GetMapping(path = "/hello-query")
    public String helloQuery(@RequestParam String query) {
        return "query " + query;
    }

    @PostMapping(path = "/register")
    public String registerUser(@RequestBody MyRequestDto request) {
        return request.toString();
    }

    //[GET] /employee/{employeeID}
    // /employee/123
    @GetMapping(path = "/employee/{employeeId}")
    public MyResponseDto getEmployeeDetails(@PathVariable String employeeId) {
        MyResponseDto response = new MyResponseDto();
        response.setId(employeeId);
        return response;
    }
}
