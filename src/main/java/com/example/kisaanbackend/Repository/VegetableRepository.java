package com.example.kisaanbackend.Repository;

import com.example.kisaanbackend.Entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable, Integer> {
}
