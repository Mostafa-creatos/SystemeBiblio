package com.ENSA.SystemeBiblio.Controller;

import com.ENSA.SystemeBiblio.DTO.LoanDTO;
import com.ENSA.SystemeBiblio.Model.Loan;
import com.ENSA.SystemeBiblio.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity<Loan> createLoan(@RequestBody LoanDTO loanDTO) {
        return ResponseEntity.ok(loanService.createLoan(loanDTO));
    }

    @GetMapping
    public ResponseEntity<List<Loan>> getAllLoans() {
        return ResponseEntity.ok(loanService.getAllLoans());
    }

    @PutMapping("/{id}/return")
    public ResponseEntity<Loan> updateLoanReturn(@PathVariable Long id, @RequestBody LoanDTO loanDTO) {
        return ResponseEntity.ok(loanService.updateLoanReturn(id, loanDTO));
    }
}
