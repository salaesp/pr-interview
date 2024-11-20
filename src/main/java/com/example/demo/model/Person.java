package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "people")
public class Person {
    @Id
    private Long id;
    private String name;
    private boolean active;
    private BigDecimal salario;
    
    @OneToMany
    @JoinColumn(name = "person_id")
    private List<Factura> facturas;
} 