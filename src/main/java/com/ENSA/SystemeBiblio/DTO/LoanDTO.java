package com.ENSA.SystemeBiblio.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LoanDTO {
    private Long id;
    private Long bookId;
    private Long borrowerId;
    private LocalDate loanDate;
    private LocalDate returnDate;
}

