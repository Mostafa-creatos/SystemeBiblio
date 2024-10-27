package com.ENSA.SystemeBiblio.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contactInfo;
}

