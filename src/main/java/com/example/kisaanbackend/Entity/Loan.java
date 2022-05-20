

package com.example.kisaanbackend.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String loan_name;
    private int interest_rate;
    private int emi;
    private int maximum_amount;

}