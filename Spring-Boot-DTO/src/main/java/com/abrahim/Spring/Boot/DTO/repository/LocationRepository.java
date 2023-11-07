package com.abrahim.Spring.Boot.DTO.repository;

import com.abrahim.Spring.Boot.DTO.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
