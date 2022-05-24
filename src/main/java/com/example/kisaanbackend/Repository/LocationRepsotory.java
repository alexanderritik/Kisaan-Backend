package com.example.kisaanbackend.Repository;

import com.example.kisaanbackend.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepsotory extends JpaRepository<Location, Integer> {

        Location findByCityName(String cityName);
}
