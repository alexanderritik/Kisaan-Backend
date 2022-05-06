package com.example.kisaanbackend.Controller;
import com.example.kisaanbackend.Entity.Experts;
import com.example.kisaanbackend.Repository.ExpertsRepository;
import com.example.kisaanbackend.Service.ExpertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpertsController {

    @Autowired
    private ExpertsRepository expertsRepository;

    @Autowired
    private ExpertsService expertsService;


    @GetMapping("/experts")
    public List<Experts> getAllExperts(){
        return expertsService.getAllExperts();
    }
    
}
