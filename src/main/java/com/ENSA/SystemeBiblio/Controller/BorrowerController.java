package com.ENSA.SystemeBiblio.Controller;

import com.ENSA.SystemeBiblio.DTO.BorrowerDTO;
import com.ENSA.SystemeBiblio.Model.Borrower;
import com.ENSA.SystemeBiblio.Service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowers")
public class BorrowerController {

    @Autowired
    private BorrowerService borrowerService;

    @PostMapping
    public ResponseEntity<Borrower> createBorrower(@RequestBody BorrowerDTO borrowerDTO) {
        return ResponseEntity.ok(borrowerService.createBorrower(borrowerDTO));
    }

    @GetMapping
    public ResponseEntity<List<Borrower>> getAllBorrowers() {
        return ResponseEntity.ok(borrowerService.getAllBorrowers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Borrower> getBorrowerById(@PathVariable Long id) {
        return ResponseEntity.ok(borrowerService.getBorrowerById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Borrower> updateBorrower(@PathVariable Long id, @RequestBody BorrowerDTO borrowerDTO) {
        return ResponseEntity.ok(borrowerService.updateBorrower(id, borrowerDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBorrower(@PathVariable Long id) {
        borrowerService.deleteBorrower(id);
        return ResponseEntity.noContent().build();
    }
}
