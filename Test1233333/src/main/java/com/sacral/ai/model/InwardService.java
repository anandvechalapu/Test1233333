package com.sacral.ai.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InwardService {

	@Id
	private Long id;
	
	private String clientName;
	
	private String productName;
	
	private String cedanttName;
	
	private String brokerName;
	
	private String processStatus;
	
	private String policyNumber;
	
	private InwardDetailsDto inwardDetailsDto;
	
	private InwardRiskAndClientDetailsDto inwardRiskAndClientDetailsDto;
	
	private SplriskFormReq splriskFormReq;
	
	private UpdateAndApproveFinalTermDto updateAndApproveFinalTermDto;
	
	private EndorsementRequestDto endorsementRequestDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCedanttName() {
		return cedanttName;
	}

	public void setCedanttName(String cedanttName) {
		this.cedanttName = cedanttName;
	}

	public String getBrokerName() {
		return brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	public InwardDetailsDto getInwardDetailsDto() {
		return inwardDetailsDto;
	}

	public void setInwardDetailsDto(InwardDetailsDto inwardDetailsDto) {
		this.inwardDetailsDto = inwardDetailsDto;
	}

	public InwardRiskAndClientDetailsDto getInwardRiskAndClientDetailsDto() {
		return inwardRiskAndClientDetailsDto;
	}

	public void setInwardRiskAndClientDetailsDto(InwardRiskAndClientDetailsDto inwardRiskAndClientDetailsDto) {
		this.inwardRiskAndClientDetailsDto = inwardRiskAndClientDetailsDto;
	}

	public SplriskFormReq getSplriskFormReq() {
		return splriskFormReq;
	}

	public void setSplriskFormReq(SplriskFormReq splriskFormReq) {
		this.splriskFormReq = splriskFormReq;
	}

	public UpdateAndApproveFinalTermDto getUpdateAndApproveFinalTermDto() {
		return updateAndApproveFinalTermDto;
	}

	public void setUpdateAndApproveFinalTermDto(UpdateAndApproveFinalTermDto updateAndApproveFinalTermDto) {
		this.updateAndApproveFinalTermDto = updateAndApproveFinalTermDto;
	}

	public EndorsementRequestDto getEndorsementRequestDto() {
		return endorsementRequestDto;
	}

	public void setEndorsementRequestDto(EndorsementRequestDto endorsementRequestDto) {
		this.endorsementRequestDto = endorsementRequestDto;
	}
	
}