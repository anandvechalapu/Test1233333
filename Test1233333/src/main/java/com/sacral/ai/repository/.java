@Repository
package com.sacral.ai.repository;

import com.sacral.ai.model.MailMasterDto;

public interface MailService {

    // Method to receive a MailMasterDto object
    public MailMasterDto receiveMail(MailMasterDto mailMasterDto);

    // Method to create an email using the information provided in the MailMasterDto object
    public MailMasterDto createEmail(MailMasterDto mailMasterDto);

    // Method to send the created email to the intended recipients
    public String sendEmail(MailMasterDto mailMasterDto);
}