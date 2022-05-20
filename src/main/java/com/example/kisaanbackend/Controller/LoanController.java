

package com.example.kisaanbackend.Controller;
import com.example.kisaanbackend.Entity.Loan;
import com.example.kisaanbackend.Repository.LoanRepository;
import com.example.kisaanbackend.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}

