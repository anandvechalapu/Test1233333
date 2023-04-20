@Repository
package com.Test44444.repository;

import java.util.List;
import java.util.Optional;

public interface DocumentGenerateServiceRepository {

    List<byte[]> getDebitNote(String id);

    List<byte[]> getInwardDebitNote(DocumentGenerationDTO dto);

    List<byte[]> getGSTBill(String id);

    List<byte[]> getGSTInvoice(String id);

    List<byte[]> getGSTInvoice(DocumentGenerationDTO dto);

    void saveDocument(byte[] document);

    Optional<byte[]> getDocument(String id);
}