package com.abrahim.Spring.Boot.DTO.dto;

import lombok.Data;

@Data
public class UserLocationDTO {
    private long uid;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
