package com.ENSA.SystemeBiblio.Repositories;


import com.ENSA.SystemeBiblio.Model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<Borrower, Long> {
}
