/**
 * 
 */
package com.candidate.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.candidate.entity.Candidate;
import com.candidate.repository.CandidateRepository;

@SpringBootTest
class CandidateServiceImplTest {

	@Mock
	CandidateRepository candidateRepository;

	@InjectMocks
	CandidateServiceImpl candidateService;

	@Test
	@DisplayName("Test - to verify the add operation")
	void testAddCandidate() throws Exception {

		// given
		Candidate sampleInput = new Candidate();
		Candidate expectedOutput = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);

		// Object obj = new Object();
		BDDMockito.given(candidateService.addCandidate(sampleInput)).willReturn(expectedOutput);

		// when
		Candidate actualOutput = candidateService.addCandidate(sampleInput);

		// verify
		assertEquals(expectedOutput, actualOutput);

	}

	
	  @Test 
	  void testUpdateCandidate() throws Exception {
		  
		   Candidate  sampleInput = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		    Candidate expectedOutput = new Candidate("Sonia Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);

		    // Mock the candidateService and define its behavior
		    CandidateService candidateService = Mockito.mock(CandidateService.class);
		    BDDMockito.when(candidateService.updateCandidate(sampleInput)).thenReturn(expectedOutput);

		    // Create an instance of the class being tested
		    Candidate candidate = new Candidate();

		    // when
		    Candidate actualOutput = candidateService.updateCandidate(sampleInput);

		    // verify
		    assertEquals(expectedOutput, actualOutput);
		  
		}

		  
	
	  
	 

	@Test
	void testGetCandidateById() throws Exception {
		Candidate sampleOutput = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		sampleOutput.setId(1);

		int sampleInput = 1;
		BDDMockito.given(candidateService.getCandidateById(sampleInput)).willReturn(sampleOutput);

		// when
		Candidate actualOutput = candidateService.getCandidateById(sampleInput);

		// verify
		assertEquals(sampleOutput, actualOutput);
		assertSame(sampleOutput.getId(), actualOutput.getId());
		assertThat(actualOutput.getId()).isGreaterThan(0);

	}

	
	@Test
	void testGetCandidateByAddress() throws Exception {

		Candidate sampleOutput = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		sampleOutput.setAddress("UP");

		String sampleInput = "UP";
	}

	@Test
	void testGetCandidateByConstituency() throws Exception {

		Candidate sampleOutput = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		sampleOutput.setConstituency("UP");

		String sampleInput = "UP";
	}

	@Test
	void testGetCandidatesBetweenIds() throws Exception {
		// give

		Candidate candidate1 = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);

		Candidate candidate2 = new Candidate("Modi", "BJP", 60, "Gujarath", "Gujarath", "9708697089", 9000);

		List<Candidate> sampleOutput = new ArrayList<>();

		int sampleInput1 = 1;
		int sampleInput2 = 20;

		BDDMockito.given(candidateService.getCandidatesBetweenIds(sampleInput1, sampleInput2)).willReturn(sampleOutput);

		// when

		List<Candidate> actualOutput = candidateService.getCandidatesBetweenIds(sampleInput1, sampleInput2);

		// verify
		assertEquals(sampleOutput, actualOutput);
		assertIterableEquals(sampleOutput, actualOutput);
		assertNotNull(actualOutput);
	}

	@Test
	void testSortingCandidatesBasedOnConstituency() throws Exception {
		Candidate candidate1 = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		Candidate candidate2 = new Candidate("Modi", "BJP", 60, "Gujarath", "Gujarath", "9708697089", 9000);

		List<Candidate> sampleOutput = Arrays.asList(candidate1, candidate2);
		// define the expected output
		List<Candidate> expectedOutput = Arrays.asList(candidate2, candidate1);

		BDDMockito.given(candidateService.SortingCandidatesBasedOnConstituency()).willReturn(sampleOutput);

		// when

		List<Candidate> actualOutput = candidateService.SortingCandidatesBasedOnConstituency();
          
		// verify
				assertEquals(sampleOutput, actualOutput);
				assertIterableEquals(sampleOutput, actualOutput);
				assertNotNull(actualOutput);

		
	}

	/*
	 * @Test 
	 * void testGetAllCandidates() { fail("Not yet implemented"); }
	 * 
	 * @Test 
	 * void testDeleteCandidateById() { fail("Not yet implemented"); }
	 */
}
