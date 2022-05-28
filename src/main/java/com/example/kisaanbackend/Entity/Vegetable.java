package com.example.kisaanbackend.Entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.ThreadContext;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String image;
    private String description;


    @ElementCollection
    @OneToMany(targetEntity = Common.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="veg_fk",referencedColumnName = "id")
    private List<Common> price;

}
