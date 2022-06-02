package com.example.kisaanbackend.Controller;
import com.example.kisaanbackend.Entity.Vegetable;
import com.example.kisaanbackend.Repository.VegetableRepository;
import com.example.kisaanbackend.Service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VegetableController {

    @Autowired
    private VegetableRepository vegetableRepository;

    @Autowired
    private VegetableService vegetableService;


    @GetMapping("/vegetables")
    public List<Vegetable> getAllVegetables(){
        return vegetableService.getAllVegetables();
    }

    @PostMapping("/addVegetable")
    public String addVegetable(@RequestBody Vegetable vegetable){
        return  vegetableService.addVegetable(vegetable);
    }

//    @GetMapping("/vegetable/{id}")
//    public Vegetable getVegetableById(@PathVariable int id){
//        return vegetableService.getVegetableById(id);
//    }

    @GetMapping("/vegetable/{name}")
    public Vegetable getVegetablesByName(@PathVariable String name){
        return vegetableService.getByName(name);
    }


    @DeleteMapping("vegetable/delete/{name}")
    public String deleteVegetable(@PathVariable String name){
        return  vegetableService.deleteVegetable(name);
    }


}
