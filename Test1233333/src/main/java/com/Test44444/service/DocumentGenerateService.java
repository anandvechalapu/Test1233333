package com.Test44444.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test44444.repository.DocumentGenerateServiceRepository;
import com.Test44444.dto.DocumentGenerationDTO;

@Service
public class DocumentGenerateService {

    @Autowired
    private DocumentGenerateServiceRepository documentGenerateServiceRepository;

    public List<byte[]> getDebitNote(String id) {
        return documentGenerateServiceRepository.getDebitNote(id);
    }

    public List<byte[]> getInwardDebitNote(DocumentGenerationDTO dto) {
        return documentGenerateServiceRepository.getInwardDebitNote(dto);
    }

    public List<byte[]> getGSTBill(String id) {
        return documentGenerateServiceRepository.getGSTBill(id);
    }

    public List<byte[]> getGSTInvoice(String id) {
        return documentGenerateServiceRepository.getGSTInvoice(id);
    }

    public List<byte[]> getGSTInvoice(DocumentGenerationDTO dto) {
        return documentGenerateServiceRepository.getGSTInvoice(dto);
    }

    public void saveDocument(byte[] document) {
        documentGenerateServiceRepository.saveDocument(document);
    }

    public Optional<byte[]> getDocument(String id) {
        return documentGenerateServiceRepository.getDocument(id);
    }

}