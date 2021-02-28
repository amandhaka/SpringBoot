package com.example.SpringBootDemo.service;


import com.example.SpringBootDemo.dto.SearchRequestDto;
import com.example.SpringBootDemo.dto.SearchResponseDto;

public interface SearchService {
    SearchResponseDto getProducts(SearchRequestDto searchRequestDto);
}
