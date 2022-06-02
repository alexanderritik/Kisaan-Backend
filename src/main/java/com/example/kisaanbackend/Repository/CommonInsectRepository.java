package com.example.kisaanbackend.Repository;

import com.example.kisaanbackend.Entity.CommonInsect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommonInsectRepository extends JpaRepository<CommonInsect, Integer> {

    CommonInsect findByCommonInsectName(String commonInsectName);

}
