package com.example.kisaanbackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
@Getter
@Setter
public class Crop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String rainfall;
    private String temperature;
    private String season;
    private String climate;
    private String month;

    @ElementCollection
    private List<String> states;



}
