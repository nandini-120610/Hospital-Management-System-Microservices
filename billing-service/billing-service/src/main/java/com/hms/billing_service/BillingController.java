package com.hms.billing_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bills")
public class BillingController {

    @Autowired
    private BillingRepository repository;

    @GetMapping
    public List<Billing> getAllBills() {
        return repository.findAll();
    }

    @PostMapping
    public Billing addBill(@RequestBody Billing bill) {
        return repository.save(bill);
    }
}