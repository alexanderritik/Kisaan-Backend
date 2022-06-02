

package com.example.kisaanbackend.Controller;
import com.example.kisaanbackend.Entity.Loan;
import com.example.kisaanbackend.Repository.LoanRepository;
import com.example.kisaanbackend.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private LoanService loanService;


    @GetMapping("/loan")
    public List<Loan> getAllLoan(){
        return loanService.getAllLoan();
    }

    @PostMapping("/addLoan")
    public Loan addLoan(@RequestBody Loan loan){
        return loanService.addLoan(loan);
    }

    @PutMapping("/loan/update")
    public String updateLoan(@RequestBody Loan loan){
        return loanService.updateLoan(loan);
    }

    @DeleteMapping("loan/delete/{id}")
    public String deleteLoan(@PathVariable int id){
        return loanService.deleteLoan(id);
    }

}

