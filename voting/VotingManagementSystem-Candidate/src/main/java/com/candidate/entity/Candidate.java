package com.candidate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "CandidateDetails")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message = "candidateName should not be null")
	private String candidateName;
	
	@NotBlank(message = "partyName should not be null")
	private String partyName;
	
	private int age;
	
	private String constituency;
	
	private String address;
	
	@NotBlank(message = "contact should not be null")
	private String contact;
	
	private long voteCount;

	public Candidate() {
		super();

	}

	public Candidate( @NotBlank(message = "candidateName should not be null")String candidateName,@NotNull(message = "partyName should not be null") String partyName, int age, String constituency, String address,
			@NotBlank(message = "contact should not be null")String contact, long voteCount) {
		super();
		
		this.candidateName = candidateName;
		this.partyName = partyName;
		this.age = age;
		this.constituency = constituency;
		this.address = address;
		this.contact = contact;
		this.voteCount = voteCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getConstituency() {
		return constituency;
	}

	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public long getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(long voteCount) {
		this.voteCount = voteCount;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", candidateName=" + candidateName + ", partyName=" + partyName + ", age=" + age
				+ ", constituency=" + constituency + ", address=" + address + ", contact=" + contact + ", voteCount="
				+ voteCount + "]";
	}

}
