

package com.example.kisaanbackend.Repository;

import com.example.kisaanbackend.Entity.Crop;
import com.example.kisaanbackend.Entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CropRepository extends JpaRepository<Crop, Integer> {

    List<Crop> findByMonth(String month);
    Crop findByName(String name);

}
