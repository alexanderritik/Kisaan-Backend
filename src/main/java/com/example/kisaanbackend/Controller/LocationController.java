package com.example.kisaanbackend.Controller;

//
import com.example.kisaanbackend.Entity.Location;
import com.example.kisaanbackend.Repository.LocationRepsotory;
import com.example.kisaanbackend.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationRepsotory locationRepsotory;


    @Autowired
    private LocationService locationService;


    @GetMapping("/locations")
    public List<Location> getAllLocation(){
        return locationService.getAllLocations();
    }

    @PostMapping("/addLocation")
    public String addLocation(@RequestBody Location location){
        return  locationService.addLocation(location);
    }


    @GetMapping("/location/{cityName}")
    public Location getByStateName(@PathVariable String cityName){
        return  locationService.getByName(cityName);
    }
}
