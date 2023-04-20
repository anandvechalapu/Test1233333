package com.sacral.ai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.ai.dto.EndorsementRequestDto;
import com.sacral.ai.dto.InwardDetailsDto;
import com.sacral.ai.dto.InwardRiskAndClientDetailsDto;
import com.sacral.ai.dto.SplriskFormReq;
import com.sacral.ai.dto.UpdateAndApproveFinalTermDto;
import com.sacral.ai.repository.InwardServiceRepository;

@Service
public class InwardService {

    @Autowired
    private InwardServiceRepository inwardServiceRepository;

    // Get all client names
    public List<String> getAllClientNames() {
        return inwardServiceRepository.getAllClientNames();
    }

    // Get all product names
    public List<String> getAllProductNames() {
        return inwardServiceRepository.getAllProductNames();
    }

    // Get all Cedantt names
    public List<String> getAllCedanttNames() {
        return inwardServiceRepository.getAllCedanttNames();
    }

    // Get all brokers names
    public List<String> getAllBrokersNames() {
        return inwardServiceRepository.getAllBrokersNames();
    }

    // Get all inward details based on the process status
    public List<Object> getAllInwardDetailsByProcessStatus(String processStatus) {
        return inwardServiceRepository.getAllInwardDetailsByProcessStatus(processStatus);
    }

    // Get all inward details based on the inward ID
    public List<Object> getAllInwardDetailsByInwardId(Long inwardId) {
        return inwardServiceRepository.getAllInwardDetailsByInwardId(inwardId);
    }

    // Get all inward details based on the client name
    public List<Object> getAllInwardDetailsByClientName(String clientName) {
        return inwardServiceRepository.getAllInwardDetailsByClientName(clientName);
    }

    // Create inward and policy details using the InwardDetailsDto object
    public void createInwardAndPolicyDetails(InwardDetailsDto inwardDetailsDto) {
        inwardServiceRepository.createInwardAndPolicyDetails(inwardDetailsDto);
    }

    // Update risk and client details using the InwardRiskAndClientDetailsDto object
    public void updateRiskAndClientDetails(InwardRiskAndClientDetailsDto inwardRiskAndClientDetailsDto) {
        inwardServiceRepository.updateRiskAndClientDetails(inwardRiskAndClientDetailsDto);
    }

    // Send back inward details using the inward ID
    public void sendBackInwardDetails(Long inwardId) {
        inwardServiceRepository.sendBackInwardDetails(inwardId);
    }

    // Approve final terms using the inward ID
    public void approveFinalTerms(Long inwardId, UpdateAndApproveFinalTermDto updateAndApproveFinalTermDto) {
        inwardServiceRepository.approveFinalTerms(inwardId, updateAndApproveFinalTermDto);
    }

    // Reject the quotation using the inward ID
    public void rejectQuotation(Long inwardId, InwardRiskAndClientDetailsDto inwardRiskAndClientDetailsDto) {
        inwardServiceRepository.rejectQuotation(inwardId, inwardRiskAndClientDetailsDto);
    }

    // Save policy number and get policy details based on the inward ID
    public Object savePolicyNumberAndGetPolicyDetails(Long inwardId) {
        return inwardServiceRepository.savePolicyNumberAndGetPolicyDetails(inwardId);
    }

    // Generate receipt details and get them based on the client name
    public Object generateReceiptDetailsByClientName(String clientName) {
        return inwardServiceRepository.generateReceiptDetailsByClientName(clientName);
    }

    // Download inward policy document using the inward ID
    public Object downloadInwardPolicyDocument(Long inwardId) {
        return inwardServiceRepository.downloadInwardPolicyDocument(inwardId);
    }

    // Get all transaction history in audit