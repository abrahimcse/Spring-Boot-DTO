package com.abrahim.Spring.Boot.DTO.service;

import com.abrahim.Spring.Boot.DTO.dto.UserLocationDTO;
import com.abrahim.Spring.Boot.DTO.model.User;
import com.abrahim.Spring.Boot.DTO.repository.UserRepository;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserLocationDTO saveUserLocation(UserLocationDTO userLocationDTO){
        User user = convertDtoToEntity(userLocationDTO);
        return convertEntityToDto(repository.save(user));

    }

    public List<UserLocationDTO> getAllUserLocation(){
        return repository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertEntityToDto(User user){
        UserLocationDTO userLocationDTO= new UserLocationDTO();
        userLocationDTO.setUid(user.getUid());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;
    }

    private User convertDtoToEntity(UserLocationDTO userLocationDTO){
        User user= new User();
        user.setUid(userLocationDTO.getUid());
        user.setEmail(userLocationDTO.getEmail());


        return user;
    }
}
