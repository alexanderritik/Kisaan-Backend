

package com.example.kisaanbackend.Controller;
import com.example.kisaanbackend.Entity.Crop;
import com.example.kisaanbackend.Repository.CropRepository;
import com.example.kisaanbackend.Service.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CropController {

    @Autowired
    private CropRepository cropRepository;

    @Autowired
    private CropService cropService;


    @GetMapping("/crop")
    public List<Crop> getAllCrops(){
        return cropService.getAllCrops();
    }

    @PostMapping("/addcrop")
    public String addCrop(@RequestBody Crop crop){
        return  cropService.addCrop(crop);
    }

    @GetMapping("/crop/{month}")
    public List<Crop> getCropsByMonth(@PathVariable String month){
        return  cropService.getByMonth(month);
    }

    @PutMapping("/crop/update")
    public String updateCrop(@RequestBody Crop crop){
        return cropService.updateCrop(crop);
    }

    @DeleteMapping("crop/delete/{name}")
    public String deleteCrop(@PathVariable String name){
        return  cropService.deleteCrop(name);
    }

}






















