package com.example.kisaanbackend.Repository;
import com.example.kisaanbackend.Entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface VegetableRepository extends JpaRepository<Vegetable, Integer> {
    Vegetable findByName(String name);

}
