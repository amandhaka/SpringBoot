package com.example.SpringBootDemo.controller;

import com.example.SpringBootDemo.service.SearchService;
import com.example.SpringBootDemo.dto.SearchRequestDto;
import com.example.SpringBootDemo.dto.SearchResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping(path = "/search")
    public SearchResponseDto getProducts(@RequestBody SearchRequestDto searchRequestDto){
        return searchService.getProducts(searchRequestDto);
    }
}

