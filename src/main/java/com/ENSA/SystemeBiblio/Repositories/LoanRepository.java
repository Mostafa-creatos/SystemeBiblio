package com.ENSA.SystemeBiblio.Repositories;


import com.ENSA.SystemeBiblio.Model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
