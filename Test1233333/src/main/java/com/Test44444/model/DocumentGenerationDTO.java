// Entity/Model class
package com.Test44444.model;

public class DocumentGenerationDTO {

    private String id;
    private byte[] document;

    public DocumentGenerationDTO() {
    }

    public DocumentGenerationDTO(String id, byte[] document) {
        this.id = id;
        this.document = document;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }
}