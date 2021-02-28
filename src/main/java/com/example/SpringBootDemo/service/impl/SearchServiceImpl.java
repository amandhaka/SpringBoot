package com.example.SpringBootDemo.service.impl;

import com.example.SpringBootDemo.client.SearchClient;
import com.example.SpringBootDemo.service.SearchService;
import com.example.SpringBootDemo.dto.ProductDto;
import com.example.SpringBootDemo.dto.SearchRequestDto;
import com.example.SpringBootDemo.dto.SearchResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private SearchClient searchClient;

    @Override
    public SearchResponseDto getProducts(SearchRequestDto searchRequestDto){
        String searchTerm = searchRequestDto.getSearchTerm();
        String locationSearch = "stockLocation: "+searchRequestDto.getLocation();
        SearchResponseDto responseDto = new SearchResponseDto();
        List<ProductDto> productDtoList = getProductsBasedOnQuery(searchTerm);
        List<ProductDto> productDtoListLocation = getProductsBasedOnQuery(locationSearch);
        responseDto.setProducts(productDtoList);
        responseDto.setLocationProducts(productDtoListLocation);
        return responseDto;
    }

    public List<ProductDto> getProductsBasedOnQuery(String query){

        Map<String,Object> productResponse = searchClient.getProducts(query);

        Map<String,Object> responseObject = (Map<String,Object>) (productResponse.get("response"));
        List<Map<String,Object>> products = (List<Map<String,Object>>) responseObject.get("docs");
        List<ProductDto> productDtoList = new ArrayList<>();

        for(Map<String,Object> productClientResponse : products){
            ProductDto product = new ProductDto();
            product.setName((String)productClientResponse.get("name"));
            if((int)productClientResponse.get("isInStock")>=1){
                product.setInStock(true);
            } else{
                product.setInStock(false);
            }
            product.setDescription((String)productClientResponse.get("description"));
            productDtoList.add(product);
        }
        return productDtoList;
    }
}
