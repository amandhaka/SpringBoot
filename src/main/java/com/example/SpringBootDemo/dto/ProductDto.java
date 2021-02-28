package com.example.SpringBootDemo.dto;

public class ProductDto {
    private String name;
    private boolean isInStock;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean insStock) {
        isInStock = insStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}