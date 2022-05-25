package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.Experts;
import com.example.kisaanbackend.Repository.ExpertsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertsService {

    @Autowired
    private ExpertsRepository expertsRepository;


    public List<Experts> getAllExperts(){
        return expertsRepository.findAll();
    }

    public  Experts addExpert(Experts expert){

            return expertsRepository.save(expert);
    }
}
