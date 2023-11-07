package com.abrahim.Spring.Boot.DTO.controller;

import com.abrahim.Spring.Boot.DTO.dto.UserLocationDTO;
import com.abrahim.Spring.Boot.DTO.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/save")
    public UserLocationDTO saveUser(@RequestBody UserLocationDTO userLocationDTO){
        return service.saveUserLocation(userLocationDTO);
    }

    @GetMapping("/users-location")
    public List<UserLocationDTO> ShowAllUserLocation(){
        return service.getAllUserLocation();
    }
}
