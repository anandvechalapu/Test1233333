package com.sacral.ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.ai.dto.EndorsementRequestDto;
import com.sacral.ai.dto.InwardDetailsDto;
import com.sacral.ai.dto.InwardRiskAndClientDetailsDto;
import com.sacral.ai.dto.SplriskFormReq;
import com.sacral.ai.dto.UpdateAndApproveFinalTermDto;

@Repository
public interface InwardServiceRepository extends JpaRepository<Object, Long> {

    // Get all client names
    List<String> getAllClientNames();

    // Get all product names
    List<String> getAllProductNames();

    // Get all Cedantt names
    List<String> getAllCedanttNames();

    // Get all brokers names
    List<String> getAllBrokersNames();

    // Get all inward details based on the process status
    List<Object> getAllInwardDetailsByProcessStatus(String processStatus);

    // Get all inward details based on the inward ID
    List<Object> getAllInwardDetailsByInwardId(Long inwardId);

    // Get all inward details based on the client name
    List<Object> getAllInwardDetailsByClientName(String clientName);

    // Create inward and policy details using the InwardDetailsDto object
    void createInwardAndPolicyDetails(InwardDetailsDto inwardDetailsDto);

    // Update risk and client details using the InwardRiskAndClientDetailsDto object
    void updateRiskAndClientDetails(InwardRiskAndClientDetailsDto inwardRiskAndClientDetailsDto);

    // Send back inward details using the inward ID
    void sendBackInwardDetails(Long inwardId);

    // Approve final terms using the inward ID
    void approveFinalTerms(Long inwardId, UpdateAndApproveFinalTermDto updateAndApproveFinalTermDto);

    // Reject the quotation using the inward ID
    void rejectQuotation(Long inwardId, InwardRiskAndClientDetailsDto inwardRiskAndClientDetailsDto);

    // Save policy number and get policy details based on the inward ID
    Object savePolicyNumberAndGetPolicyDetails(Long inwardId);

    // Generate receipt details and get them based on the client name
    Object generateReceiptDetailsByClientName(String clientName);

    // Download inward policy document using the inward ID
    Object downloadInwardPolicyDocument(Long inwardId);

    // Get all transaction history in audit log and transaction history
    Object getAllTransactionHistory();

    // Get the inward summary details and approved capacity
    Object getInwardSummaryDetailsAndApprovedCapacity();

    // Save special risk data
    void saveSpecialRiskData(SplriskFormReq splriskFormReq);

    // Approve final term
    void approveFinalTerm(Long inwardId, EndorsementRequestDto endorsementRequestDto);

    // Return final term
    void returnFinalTerm(Long inwardId, EndorsementRequestDto endorsementRequestDto);

    // Reject final term
    void rejectFinalTerm(Long inwardId, EndorsementRequestDto endorsementRequestDto);

    // Get endorsement inward details
    Object getEndorsementInwardDetails(Long inwardId);

}