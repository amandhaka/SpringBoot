package com.example.SpringBootDemo.Service;

import com.example.SpringBootDemo.dto.MyRequestDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    boolean updateEmployee(MyRequestDto request, String id);
}
