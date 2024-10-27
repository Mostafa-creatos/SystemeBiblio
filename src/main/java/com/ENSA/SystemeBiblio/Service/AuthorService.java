package com.ENSA.SystemeBiblio.Service;


import com.ENSA.SystemeBiblio.DTO.AuthorDTO;
import com.ENSA.SystemeBiblio.Model.Author;

import java.util.List;

public interface AuthorService {
    Author createAuthor(AuthorDTO authorDTO);
    List<Author> getAllAuthors();
    Author getAuthorById(Long id);
    Author updateAuthor(Long id, AuthorDTO authorDTO);
    void deleteAuthor(Long id);
}
