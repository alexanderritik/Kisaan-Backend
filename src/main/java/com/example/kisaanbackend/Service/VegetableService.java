package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.Crop;
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


    public String addVegetable(Vegetable vegetable){

        Vegetable check = vegetableRepository.findByName(vegetable.getName());

        if(check!=null){
            return "Vegetable with this name already present";
        }

        else {
             vegetableRepository.save(vegetable);
             return "Vegetable Added";
        }
    }


    public List<Vegetable> getAllVegetables(){
        return vegetableRepository.findAll();
    }

//    public Vegetable getVegetableById(int id){
//        Optional<Vegetable> optionalVegetable = vegetableRepository.findById(id);
//
//        if(optionalVegetable.isPresent()){
//
//            return optionalVegetable.get();
//
//        }else return  null;
//    }

    public Vegetable getByName(String name){
        return vegetableRepository.findByName(name);
    }




    public  String deleteVegetable(String name){
        Vegetable delVegegtable = vegetableRepository.findByName(name);
        int delId = delVegegtable.getId();


        Optional<Vegetable> oldVegetable = vegetableRepository.findById(delId);
        if(oldVegetable.isPresent()){
            vegetableRepository.deleteById(delId);
            return "Vegetable Deleted";
        }else return "Vegetable Not Found";


    }



}
