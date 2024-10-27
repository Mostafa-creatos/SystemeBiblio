package com.ENSA.SystemeBiblio.Service.ServiceImpl;


import com.ENSA.SystemeBiblio.DTO.BorrowerDTO;
import com.ENSA.SystemeBiblio.Model.Borrower;
import com.ENSA.SystemeBiblio.Repositories.BorrowerRepository;
import com.ENSA.SystemeBiblio.Service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowerServiceImpl implements BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

    @Override
    public Borrower createBorrower(BorrowerDTO borrowerDTO) {
        Borrower borrower = new Borrower();
        borrower.setName(borrowerDTO.getName());
        borrower.setContactInfo(borrowerDTO.getContactInfo());
        return borrowerRepository.save(borrower);
    }

    @Override
    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    @Override
    public Borrower getBorrowerById(Long id) {
        return borrowerRepository.findById(id).orElseThrow(() -> new RuntimeException("Borrower not found"));
    }

    @Override
    public Borrower updateBorrower(Long id, BorrowerDTO borrowerDTO) {
        Borrower borrower = borrowerRepository.findById(id).orElseThrow(() -> new RuntimeException("Borrower not found"));
        borrower.setName(borrowerDTO.getName());
        borrower.setContactInfo(borrowerDTO.getContactInfo());
        return borrowerRepository.save(borrower);
    }

    @Override
    public void deleteBorrower(Long id) {
        borrowerRepository.deleteById(id);
    }
}
