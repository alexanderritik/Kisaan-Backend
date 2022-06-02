package com.example.kisaanbackend.Repository;

import com.example.kisaanbackend.Entity.Insect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsectRepository extends JpaRepository<Insect, Integer> {

    Insect findByInsectName(String insectName);
}
