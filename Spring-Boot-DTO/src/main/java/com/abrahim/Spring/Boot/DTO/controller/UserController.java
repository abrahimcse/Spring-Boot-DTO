package com.abrahim.Spring.Boot.DTO.controller;

import com.abrahim.Spring.Boot.DTO.dto.UserLocationDTO;
import com.abrahim.Spring.Boot.DTO.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users-location")
    public List<UserLocationDTO> ShowAllUserLocation(){
        return service.getAllUserLocation();
    }
}
