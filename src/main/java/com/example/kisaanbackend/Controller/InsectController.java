package com.example.kisaanbackend.Controller;

import com.example.kisaanbackend.Entity.Insect;
import com.example.kisaanbackend.Service.CommonInsectService;
import com.example.kisaanbackend.Service.InsectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InsectController {

    @Autowired
    private InsectService insectService;

    @Autowired
    private CommonInsectService commonInsectService;

    @GetMapping("/insects")
    public List<Insect> getAllInsects(){
        return  insectService.getAllInsects();
    }

    @PostMapping("/addInsect")
    public String addInsect(Insect insect){
        return insectService.addInsect(insect);
    }

    @GetMapping("/insect/{lan}/{name}")
    public Insect getInsectByEnName(@PathVariable String lan, @PathVariable String name){
        return insectService.getByName(lan, name);
    }


    @DeleteMapping("/insect/{lan}/{name}")
    public String deleteInsectByName(@PathVariable String lan, @PathVariable String name){
        return insectService.deleteInsect(lan, name);
    }

    @DeleteMapping("/deleteInsect/{id}")
    public String deleteById(@PathVariable int id){
        return insectService.DeleteById(id);
    }


}
