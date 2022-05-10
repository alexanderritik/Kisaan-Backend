

package com.example.kisaanbackend.Repository;

import com.example.kisaanbackend.Entity.Crop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropRepository extends JpaRepository<Crop, Integer> {
}
