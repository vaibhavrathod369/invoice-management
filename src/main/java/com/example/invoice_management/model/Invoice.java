package com.example.invoice_management.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vendorName;
    private Double amount;
    private LocalDate invoiceDate;
    private String status; // PENDING, APPROVED, PAID

    public Invoice() {}

    public Invoice(String vendorName, Double amount, LocalDate invoiceDate, String status) {
        this.vendorName = vendorName;
        this.amount = amount;
        this.invoiceDate = invoiceDate;
        this.status = status;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getVendorName() { return vendorName; }
    public void setVendorName(String vendorName) { this.vendorName = vendorName; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDate getInvoiceDate() { return invoiceDate; }
    public void setInvoiceDate(LocalDate invoiceDate) { this.invoiceDate = invoiceDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}