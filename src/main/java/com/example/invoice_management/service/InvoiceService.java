package com.example.invoice_management.service;

import com.example.invoice_management.model.Invoice;
import com.example.invoice_management.repository.InvoiceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository repo;

    public InvoiceService(InvoiceRepository repo) {
        this.repo = repo;
    }

    public List<Invoice> getAllInvoices() {
        return repo.findAll();
    }

    public Invoice createInvoice(Invoice invoice) {
        invoice.setStatus("PENDING");
        return repo.save(invoice);
    }

    public Invoice approveInvoice(Long id) {
        Invoice inv = repo.findById(id).orElseThrow();
        inv.setStatus("APPROVED");
        return repo.save(inv);
    }

    public void deleteInvoice(Long id) {
        repo.deleteById(id);
    }
}
