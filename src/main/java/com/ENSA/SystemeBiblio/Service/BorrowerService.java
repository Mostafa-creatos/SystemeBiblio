package com.ENSA.SystemeBiblio.Service;



import com.ENSA.SystemeBiblio.DTO.BorrowerDTO;
import com.ENSA.SystemeBiblio.Model.Borrower;

import java.util.List;

public interface BorrowerService {
    Borrower createBorrower(BorrowerDTO borrowerDTO);
    List<Borrower> getAllBorrowers();
    Borrower getBorrowerById(Long id);
    Borrower updateBorrower(Long id, BorrowerDTO borrowerDTO);
    void deleteBorrower(Long id);
}

