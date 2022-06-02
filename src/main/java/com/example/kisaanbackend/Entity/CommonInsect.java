package com.example.kisaanbackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class CommonInsect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String commonInsectName;

    @ElementCollection
    private List<String> insectNames;
    @ElementCollection
    private List<String> insectDetails;
    @ElementCollection
    private List<String> cropsAffects;
    @ElementCollection
    private List<String> pesticides;
}
