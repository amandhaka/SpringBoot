package com.example.SpringBootDemo.dto;

import java.util.List;

public class SearchResponseDto {

    private List<ProductDto> products;
    private List<ProductDto> locationProducts;

    public List<ProductDto> getLocationProducts() {
        return locationProducts;
    }

    public void setLocationProducts(List<ProductDto> locationProducts) {
        this.locationProducts = locationProducts;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }
}
