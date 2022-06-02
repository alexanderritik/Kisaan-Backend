package com.example.kisaanbackend.Service;


import com.example.kisaanbackend.Entity.Loan;
import com.example.kisaanbackend.Repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;


    public List<Loan> getAllLoan(){
        return loanRepository.findAll();
    }

    public Loan addLoan(Loan loan){
        return loanRepository.save(loan);
    }

    public String updateLoan(Loan loan){


        Optional<Loan> oldLoan = loanRepository.findById(loan.getId());

        if(oldLoan.isPresent()){
            Loan newLoan = oldLoan.get();

            newLoan.setLoan_name(loan.getLoan_name());
            newLoan.setEmi(loan.getEmi());
            newLoan.setInterest_rate(loan.getInterest_rate());
            newLoan.setMaximum_amount(loan.getMaximum_amount());

            loanRepository.save(newLoan);

            return "Loan Updated!!";
        }else return "Loan Not Found!!";


    }

    public String deleteLoan(int delId){



        Optional<Loan> oldLoan = loanRepository.findById(delId);
        if(oldLoan.isPresent()){
            loanRepository.deleteById(delId);
            return "Loan Deleted";
        }else return "Loan Not Found";


    }

}
