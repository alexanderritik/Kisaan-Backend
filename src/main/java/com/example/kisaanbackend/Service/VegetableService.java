package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.Vegetable;
import com.example.kisaanbackend.Repository.VegetableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableService {

    @Autowired
    private VegetableRepository vegetableRepository;


    public Vegetable addVegetable(Vegetable vegetable){
        return vegetableRepository.save(vegetable);
    }


    public List<Vegetable> getAllVegetables(){
        return vegetableRepository.findAll();
    }

    public Vegetable getVegetableById(int id){
        Optional<Vegetable> optionalVegetable = vegetableRepository.findById(id);

        if(optionalVegetable.isPresent()){

            return optionalVegetable.get();

        }else return  null;
    }

    public List<Vegetable> getByLocation(String location){
        return vegetableRepository.findByLocation(location);
    }
}
