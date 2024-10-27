package com.ENSA.SystemeBiblio.DTO;


import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String isbn;
    private String author;
    private String availabilityStatus;
}
