package com.example.SpringBootDemo.dto;

public class SearchRequestDto {

    private String searchTerm;

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    @Override
    public String toString() {
        return "SearchRequestDTO{" + "searchTerm='" + searchTerm + '\'' + '}';
    }
}
