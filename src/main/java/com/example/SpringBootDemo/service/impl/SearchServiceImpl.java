package com.example.SpringBootDemo.service.impl;

import com.example.SpringBootDemo.service.SearchService;
import com.example.SpringBootDemo.dto.ProductDto;
import com.example.SpringBootDemo.dto.SearchRequestDto;
import com.example.SpringBootDemo.dto.SearchResponseDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class SearchServiceImpl implements SearchService {

    @Override
    public SearchResponseDto getProducts(SearchRequestDto searchRequestDto){
        SearchResponseDto responseDto = new SearchResponseDto();
        ProductDto productDto = new ProductDto();
        productDto.setName("Samsung Galaxy s5");
        productDto.setInsStock(true);
        productDto.setDescription("Blah Blah Blah");
        responseDto.setProducts(Arrays.asList(productDto));
        return responseDto;
    }
}
