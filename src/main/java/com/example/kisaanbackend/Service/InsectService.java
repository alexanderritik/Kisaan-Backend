package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.CommonInsect;
import com.example.kisaanbackend.Entity.Crop;
import com.example.kisaanbackend.Entity.Insect;
import com.example.kisaanbackend.Repository.CommonInsectRepository;
import com.example.kisaanbackend.Repository.InsectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsectService {

    @Autowired
    public InsectRepository insectRepository;

    @Autowired
    public CommonInsectRepository commonInsectRepository;

    public List<Insect> getAllInsects(){
        return  insectRepository.findAll();
    }

    public String addInsect(Insect insect){
        Insect check = insectRepository.findByInsectName(insect.getInsectName());

        if(check!=null){
            return "Insect with the given name already exists";
        }

        else{
            insectRepository.save(insect);
            return "Insect Added";
        }
    }


    public Insect getByName(String lan, String name){

        CommonInsect oldCommonInsect = commonInsectRepository.findByCommonInsectName(name);

        Insect insect = null;

        if(lan.equals("en")) {
            insect = insectRepository.findByInsectName(oldCommonInsect.getInsectNames().get(0));
        }

        else if(lan.equals("hin")) {
            insect = insectRepository.findByInsectName(oldCommonInsect.getInsectNames().get(1));
        }

        else {
            insect = insectRepository.findByInsectName(oldCommonInsect.getInsectNames().get(2));
        }

        return insect;

    }




    public  String deleteInsect(String lan, String name){
        CommonInsect oldCommonInsect = commonInsectRepository.findByCommonInsectName(name);


        Insect insect = null;

        if(lan.equals("en")) {
            insect = insectRepository.findByInsectName(oldCommonInsect.getInsectNames().get(0));
        }

        else if(lan.equals("hin")) {
            insect = insectRepository.findByInsectName(oldCommonInsect.getInsectNames().get(1));
        }

        else {
            insect = insectRepository.findByInsectName(oldCommonInsect.getInsectNames().get(2));
        }

        int delId = -1;

        if(insect!=null) {
            delId = insect.getId();
        }

        Optional<Insect> oldInsect = insectRepository.findById(delId);
        if(oldInsect.isPresent()){
            insectRepository.deleteById(delId);
            return "Insect Deleted";
        }else return "Insect Not Found";


    }


    public String DeleteById(int id){

        Optional<Insect> oldInsect = insectRepository.findById(id);

        if(oldInsect.isPresent()){
            insectRepository.deleteById(id);
            return "Insect Deleted";
        }else return "Insect Not Found";

    }



}
