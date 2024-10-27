package com.ENSA.SystemeBiblio.Service;



import com.ENSA.SystemeBiblio.DTO.LoanDTO;
import com.ENSA.SystemeBiblio.Model.Loan;

import java.util.List;

public interface LoanService {
    Loan createLoan(LoanDTO loanDTO);
    List<Loan> getAllLoans();
    Loan updateLoanReturn(Long id, LoanDTO loanDTO);
}
