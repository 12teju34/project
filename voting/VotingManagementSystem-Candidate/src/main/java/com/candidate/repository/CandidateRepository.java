package com.candidate.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.candidate.entity.Candidate;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer>, ICandidateCustomRepository{

	

}
