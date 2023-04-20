// Service Classes

package com.Test44444.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Test44444.model.ForgetPasswordService;
import com.Test44444.service.DocumentGenerateService;
import com.Test44444.service.ForgetPasswordServiceService;
import com.Test44444.dto.DocumentGenerationDTO;

@RestController
public class Test44444Controller {

    @Autowired
    private ForgetPasswordServiceService forgetPasswordServiceService;

    @Autowired
    private DocumentGenerateService documentGenerateService;

    @GetMapping("/forget-password")
    public ForgetPasswordService findByUsername(@RequestParam String username) {
        return forgetPasswordServiceService.findByUsername(username);
    }

    @PostMapping("/forget-password")
    public void updatePassword(@RequestParam String password, @RequestParam String username) {
        forgetPasswordServiceService.updatePassword(password, username);
    }

    @GetMapping("/debit-note")
    public List<byte[]> getDebitNote(@RequestParam String id) {
        return documentGenerateService.getDebitNote(id);
    }

    @PostMapping("/inward-debit-note")
    public List<byte[]> getInwardDebitNote(@RequestBody DocumentGenerationDTO dto) {
        return documentGenerateService.getInwardDebitNote(dto);
    }

    @GetMapping("/GST-bill")
    public List<byte[]> getGSTBill(@RequestParam String id) {
        return documentGenerateService.getGSTBill(id);
    }

    @GetMapping("/GST-invoice")
    public List<byte[]> getGSTInvoice(@RequestParam String id) {
        return documentGenerateService.getGSTInvoice(id);
    }

    @PostMapping("/GST-invoice")
    public List<byte[]> getGSTInvoice(@RequestBody DocumentGenerationDTO dto) {
        return documentGenerateService.getGSTInvoice(dto);
    }

    @PostMapping("/save-document")
    public void saveDocument(@RequestBody byte[] document) {
        documentGenerateService.saveDocument(document);
    }

    @GetMapping("/document")
    public Optional<byte[]> getDocument(@RequestParam String id) {
        return documentGenerateService.getDocument(id);
    }
}