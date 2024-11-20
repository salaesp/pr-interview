package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "factura")
public class Factura {
    @Id
    private Long id;
    private String tipo;
    private BigDecimal monto;
} 