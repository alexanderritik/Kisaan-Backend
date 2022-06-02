package com.example.kisaanbackend.Controller;

import com.example.kisaanbackend.Entity.CommonInsect;
import com.example.kisaanbackend.Repository.CommonInsectRepository;
import com.example.kisaanbackend.Service.CommonInsectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommonInsectController {

    @Autowired
    private CommonInsectRepository commonInsectRepository;

    @Autowired
    private CommonInsectService commonInsectService;

    @GetMapping("/commonInsects")
    public List<CommonInsect> getAllCommonInsects(){
        return commonInsectService.getAllCommonInsects();
    }

    @PostMapping("/addCommonInsect")
    public String addCommonInsect(@RequestBody CommonInsect commonInsect){
        return commonInsectService.addCommonInsects(commonInsect);
    }

    @GetMapping("/commonInsect/{lan}")
    public List<String> getLangauageForCommonInsect(@PathVariable String lan){
        return commonInsectService.langInsect(lan);
    }
}
