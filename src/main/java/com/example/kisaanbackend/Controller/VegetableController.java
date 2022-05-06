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
    public Vegetable addVegetable(@RequestBody Vegetable vegetable){
        return  vegetableService.addVegetable(vegetable);
    }

    @GetMapping("/vegetable/{id}")
    public Vegetable getVegetableById(@PathVariable int id){
        return vegetableService.getVegetableById(id);
    }

    @GetMapping("/vegetableLocation/{location}")
    public List<Vegetable> getVegetablesByLocation(@PathVariable String location){
        return vegetableService.getByLocation(location);
    }
}
