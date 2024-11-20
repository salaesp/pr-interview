package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "invoices")
public class Invoice {
    @Id
    private Long id;
    
    private String type;
    
    private BigDecimal amount;
} 