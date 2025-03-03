package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {
    @Autowired
    private BillRepository billRepository;

    @PostMapping("/pay")
    public ResponseEntity<Bill> payBill(@RequestBody Bill bill) {
        return ResponseEntity.ok(billRepository.save(bill));
    }
}
