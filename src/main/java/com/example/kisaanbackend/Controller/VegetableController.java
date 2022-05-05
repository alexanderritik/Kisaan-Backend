package com.example.kisaanbackend.Controller;
import com.example.kisaanbackend.Entity.Vegetable;
import com.example.kisaanbackend.Repository.VegetableRepository;
import com.example.kisaanbackend.Service.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
