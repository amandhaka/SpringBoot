package com.example.SpringBootDemo.dto;

import java.util.List;

public class SearchResponseDto {

    private List<ProductDto> products;

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
