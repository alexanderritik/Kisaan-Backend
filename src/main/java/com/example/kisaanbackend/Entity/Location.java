package com.example.kisaanbackend.Entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Map;

@Entity
@Getter
@Setter
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cityName;



    @ElementCollection
    private Map<String, Float> vegetables;
}
