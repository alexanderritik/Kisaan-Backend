package com.example.kisaanbackend.Service;

import com.example.kisaanbackend.Entity.Loan;
import com.example.kisaanbackend.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;


    public List<Loan> getAllLoan(){
        return loanRepository.findAll();
    }
}
