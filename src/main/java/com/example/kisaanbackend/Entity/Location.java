package com.example.kisaanbackend.Entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;
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
    @OneToMany(targetEntity = Common.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="loc_fk",referencedColumnName = "id")
    private List<Common> vegetables;
}
