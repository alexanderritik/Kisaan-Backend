package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.Crop;
import com.example.kisaanbackend.Repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CropService {

    @Autowired
    private  CropRepository cropRepository;


    public String addCrop(Crop crop){

        Crop demo = cropRepository.findByName(crop.getName());

        if(demo!=null) return "Crop already exists";

        else {
             cropRepository.save(crop);
             return "Crop Added";
        }
    }


    public List<Crop> getAllCrops(){
        return cropRepository.findAll();
    }

    public  List<Crop> getByMonth(String month){
       return cropRepository.findByMonth(month);
    }

    public String updateCrop(Crop crop){
        Optional<Crop> oldCrop = cropRepository.findById(crop.getId());

        if(oldCrop.isPresent()){
            Crop newCrop = oldCrop.get();

            newCrop.setClimate(crop.getClimate());
            newCrop.setMonth(crop.getMonth());
            newCrop.setName(crop.getName());
            newCrop.setRainfall(crop.getRainfall());
            newCrop.setSeason(crop.getSeason());
            newCrop.setStates(crop.getStates());
            newCrop.setTemperature(crop.getTemperature());

            cropRepository.save(newCrop);

            return "Crop Updated!!";
        }else return "Crop Not Found!!";
    }


    public  String deleteCrop(String name){
        Crop delCrop = cropRepository.findByName(name);
        int delId = delCrop.getId();


        Optional<Crop> oldCrop = cropRepository.findById(delId);
        if(oldCrop.isPresent()){
            cropRepository.deleteById(delId);
            return "Crop Deleted";
        }else return "Crop Not Found";


    }
}
