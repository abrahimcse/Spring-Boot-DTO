package com.abrahim.Spring.Boot.DTO.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "location_tbl")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lid;
    private String place;
    private String description;
    private double longitude;
    private double latitude;


}
