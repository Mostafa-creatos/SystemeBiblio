package com.ENSA.SystemeBiblio.Service;


import com.ENSA.SystemeBiblio.DTO.BookDTO;
import com.ENSA.SystemeBiblio.Model.Book;

import java.util.List;

public interface BookService {
    Book createBook(BookDTO bookDTO);
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
}
