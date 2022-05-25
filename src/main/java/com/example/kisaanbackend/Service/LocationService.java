package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.Location;
import com.example.kisaanbackend.Repository.LocationRepsotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepsotory locationRepsotory;


    public String addLocation(Location location){
        locationRepsotory.save(location);

        return "Location Added";
    }


    public Location getByName(String cityName){

         Location loc = locationRepsotory.findByCityName(cityName);

         if(loc!=null)
          return locationRepsotory.findByCityName(cityName);

         else{

             Location loct = new Location();
             loct.setCityName("Not Found with any City with this "+ cityName);
             loct.setVegetables(null);

             return loct;
         }

    }

    public List<Location> getAllLocations(){
        return locationRepsotory.findAll();
    }
}
