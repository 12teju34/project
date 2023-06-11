package com.candidate.dto;

public class CandidateDefaultResponseDTO implements MyDTO {

	private String candidateName;
	private String address;
	private String constituency;

	public String getCandidateName() {

		return candidateName;
	}

	public void setCandidateName(String candidateName) {

		this.candidateName = candidateName;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	CandidateDefaultResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateDefaultResponseDTO(String candidateName, String address, String constituency) {
		super();
		this.candidateName = candidateName;
		this.address = address;
		this.constituency = constituency;
	}

}
