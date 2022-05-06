package com.example.kisaanbackend.Repository;

import com.example.kisaanbackend.Entity.Experts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertsRepository extends JpaRepository<Experts, Integer> {
}
