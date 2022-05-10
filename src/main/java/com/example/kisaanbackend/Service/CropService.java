package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.Crop;
import com.example.kisaanbackend.Repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropService {

    @Autowired
    private  CropRepository cropRepository;


    public Crop addCrop(Crop crop){
        return cropRepository.save(crop);
    }


    public List<Crop> getAllCrops(){
        return cropRepository.findAll();
    }
}
