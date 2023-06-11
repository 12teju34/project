package com.candidate.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.candidate.dto.CandidateDefaultResponseDTO;
import com.candidate.entity.Candidate;
@Component
@Scope("singleton")

public class CandidateDTOConvertor {
		public static CandidateDefaultResponseDTO getCandidateDefaultDTO(Candidate candidate) {
			CandidateDefaultResponseDTO dto = new CandidateDefaultResponseDTO(candidate.getCandidateName(),
					candidate.getAddress(), candidate.getConstituency());

			return dto;
		}

		public static CandidateDefaultResponseDTO convertToDTO(Candidate savedCandidate) {
			// TODO Auto-generated method stub
			return null;
		}
	}
