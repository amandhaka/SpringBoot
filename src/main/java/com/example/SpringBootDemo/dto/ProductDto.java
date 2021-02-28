package com.example.SpringBootDemo.dto;

public class ProductDto {
    private String name;
    private boolean isInsStock;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInsStock() {
        return isInsStock;
    }

    public void setInsStock(boolean insStock) {
        isInsStock = insStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}