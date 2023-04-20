logs
    public List<Object> getAllTransactionHistoryInAuditLogs() {
        return inwardServiceRepository.getAllTransactionHistoryInAuditLogs();
    }

    // Raise endorsement request using the EndorsementRequestDto object
    public void raiseEndorsementRequest(EndorsementRequestDto endorsementRequestDto) {
        inwardServiceRepository.raiseEndorsementRequest(endorsementRequestDto);
    }

    // Generate special risk form using the SplriskFormReq object
    public void generateSpecialRiskForm(SplriskFormReq splriskFormReq) {
        inwardServiceRepository.generateSpecialRiskForm(splriskFormReq);
    }

}

package com.sacral.ai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.ai.dto.EndorsementRequestDto;
import com.sacral.ai.dto.InwardDetailsDto;
import com.sacral.ai.dto.InwardRiskAndClientDetailsDto;
import com.sacral.ai.dto.MailMasterDto;
import com.sacral.ai.dto.SplriskFormReq;
import com.sacral.ai.dto.UpdateAndApproveFinalTermDto;
import com.sacral.ai.model.MailMasterDto;
import com.sacral.ai.service.InwardService;
import com.sacral.ai.service.MailServiceImpl;

@RestController
public class InwardController {
	
	@Autowired
	private InwardService inwardService;
	
	@Autowired
	private MailServiceImpl mailService;

	// Get all client names
	@GetMapping("/clients")
	public ResponseEntity<List<String>> getAllClientNames() {
		List<String> clientNames = inwardService.getAllClientNames();
		return new ResponseEntity<>(clientNames, HttpStatus.OK);
	}

	// Get all product names
	@GetMapping("/products")
	public ResponseEntity<List<String>> getAllProductNames() {
		List<String> productNames = inwardService.getAllProductNames();
		return new ResponseEntity<>(productNames, HttpStatus.OK);
	}

	// Get all Cedantt names
	@GetMapping("/cedants")
	public ResponseEntity<List<String>> getAllCedanttNames() {
		List<String> cedantsNames = inwardService.getAllCedanttNames();
		return new ResponseEntity<>(cedantsNames, HttpStatus.OK);
	}

	// Get all brokers names
	@GetMapping("/brokers")
	public ResponseEntity<List<String>> getAllBrokersNames() {
		List<String> brokersNames = inwardService.getAllBrokersNames();
		return new ResponseEntity<>(brokersNames, HttpStatus.OK);
	}

	// Get all inward details based on the process status
	@GetMapping("/inwards")
	public ResponseEntity<List<Object>> getAllInwardDetailsByProcessStatus(@RequestParam String processStatus) {
		List<Object> inwardDetails = inwardService.getAllInwardDetailsByProcessStatus(processStatus);
		return new ResponseEntity<>(inwardDetails, HttpStatus.OK);
	}
	
	// Get all inward details based on the inward ID
	@GetMapping("/inwards/{id}")
	public ResponseEntity<List<Object>> getAllInwardDetailsByInwardId(@RequestParam Long inwardId) {
		List<Object> inwardDetails = inwardService.getAllInwardDetailsByInwardId