package com.example.invoice_management.controller;

import com.example.invoice_management.model.Invoice;
import com.example.invoice_management.service.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {
    private final InvoiceService service;

    public InvoiceController(InvoiceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Invoice> getAll() {
        return service.getAllInvoices();
    }

    @PostMapping
    public Invoice create(@RequestBody Invoice invoice) {
        return service.createInvoice(invoice);
    }

    @PutMapping("/{id}/approve")
    public Invoice approve(@PathVariable Long id) {
        return service.approveInvoice(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteInvoice(id);
    }
}