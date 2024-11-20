package com.example.demo.controller;

import com.example.demo.model.Invoice;
import com.example.demo.model.Person;
import com.example.demo.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/v1/people")
public class PersonController {
    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping
    public ResponseEntity<Person> getPersonById(@RequestParam String id) {
        List<Person> all = peopleRepository.findAll();
        Person personWithId = null;
        for (int i = 0; i < all.size(); i++) {
            if (all.get(i).getId() == Long.valueOf(id) && all.get(i).isActive()) {
                personWithId = all.get(i);
            }
        }
        if (personWithId != null) {
            personWithId.setSalary(this.calculateSalary(personWithId));
            return ResponseEntity.ok(personWithId);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    private BigDecimal calculateSalary(Person person) {
        List<Invoice> invoices = person.getInvoices();
        BigDecimal total = BigDecimal.ZERO;
        for (Invoice invoice : invoices) {
            switch (invoice.getType()) {
                case "PAYMENT":
                    break;
                case "CHARGE":
                    total = total.add(invoice.getAmount());
                    break;
                default:
                    break;
            }
        }
        return total;
    }
} 