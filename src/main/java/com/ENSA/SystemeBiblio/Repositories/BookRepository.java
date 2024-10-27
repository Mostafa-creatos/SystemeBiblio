package com.ENSA.SystemeBiblio.Repositories;

import com.ENSA.SystemeBiblio.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
