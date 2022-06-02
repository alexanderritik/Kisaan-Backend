package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.Crop;
import com.example.kisaanbackend.Entity.Location;
import com.example.kisaanbackend.Repository.LocationRepsotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepsotory locationRepsotory;


    public String addLocation(Location location){

        Location check = locationRepsotory.findByCityName(location.getCityName());

        if(check!=null) return "This Location already added";

        else {
            locationRepsotory.save(location);

            return "Location Added";
        }
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


    public  String deleteLocation(String name){
        Location delLocation = locationRepsotory.findByCityName(name);
        int delId = delLocation.getId();


        Optional<Location> oldLocation = locationRepsotory.findById(delId);
        if(oldLocation.isPresent()){
            locationRepsotory.deleteById(delId);
            return "Location Deleted";
        }else return "Location Not Found";


    }


}
