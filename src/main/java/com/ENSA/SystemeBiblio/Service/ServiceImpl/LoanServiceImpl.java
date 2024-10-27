package com.ENSA.SystemeBiblio.Service.ServiceImpl;


import com.ENSA.SystemeBiblio.DTO.LoanDTO;
import com.ENSA.SystemeBiblio.Model.Book;
import com.ENSA.SystemeBiblio.Model.Borrower;
import com.ENSA.SystemeBiblio.Model.Loan;
import com.ENSA.SystemeBiblio.Repositories.BookRepository;
import com.ENSA.SystemeBiblio.Repositories.BorrowerRepository;
import com.ENSA.SystemeBiblio.Repositories.LoanRepository;
import com.ENSA.SystemeBiblio.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BorrowerRepository borrowerRepository;

    @Override
    public Loan createLoan(LoanDTO loanDTO) {
        Loan loan = new Loan();
        Book book = bookRepository.findById(loanDTO.getBookId())
                .orElseThrow(() -> new RuntimeException("Book not found"));
        Borrower borrower = borrowerRepository.findById(loanDTO.getBorrowerId())
                .orElseThrow(() -> new RuntimeException("Borrower not found"));

        loan.setBook(book);
        loan.setBorrower(borrower);
        loan.setLoanDate(loanDTO.getLoanDate());
        loan.setReturnDate(loanDTO.getReturnDate());
        return loanRepository.save(loan);
    }

    @Override
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    @Override
    public Loan updateLoanReturn(Long id, LoanDTO loanDTO) {
        Loan loan = loanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Loan not found"));

        loan.setReturnDate(loanDTO.getReturnDate());
        return loanRepository.save(loan);
    }
}
