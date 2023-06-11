/**
 * 
 */
package com.candidate.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandidateTest {

	
	  @Test 
	  void testCandidate() { 
		  
		    Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);

		    // Assert the values returned by the getter methods
		   
		    assertEquals("Rahul Gandhi", candidate.getCandidateName());
		    assertEquals("UP", candidate.getAddress());
		    assertEquals("UP", candidate.getConstituency());
		    assertEquals(60, candidate.getAge());
		    assertEquals("Congress", candidate.getPartyName());
		    assertEquals("9809809808", candidate.getContact());
		    assertEquals(10000, candidate.getVoteCount());
		    

	  }
	  
	 /* @Test 
	 * void testCandidateStringStringIntStringStringStringLong() {
	 * fail("Not yet implemented"); }
	 */

	@Test
	void testGetId() {

		Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		int id = candidate.getId();
		equals(id);

	}

	@Test
	void testSetId() {
		
		Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		candidate.setId(2);
		equals(candidate.getId());

	}

	
	  @Test
	  void testGetCandidateName() { 
		  Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
			String candidateName = candidate.getCandidateName();
			assertEquals("Rahul Gandhi",candidateName);
	  }
	  
	  
	 /* @Test void testSetCandidateName() { fail("Not yet implemented"); }
	 * 
	 * 
	 * @Test void testGetPartyName() { fail("Not yet implemented"); }
	 * 
	 */ 
	 @Test void testSetPartyName() {
		 
		  Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		    candidate.setPartyName("CNG");
		    assertEquals("CNG", candidate.getPartyName());


		 
	 }
	 
	 
	 
	  
	  @Test
	  void testGetAge() { 
	     
	     Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
			int age = candidate.getAge();
			assertEquals(60,age);

	   
	   
	   }
	  
	
	 @Test void testSetAge() { 
		 
		    Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		    candidate.setAge(35);
		    assertEquals(35, candidate.getAge());

	 }
	  
	 
	  @Test
	  void testGetConstituency() { 
		  Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		    String constituency = candidate.getConstituency();
		  assertEquals("UP",constituency);

	  
	  }
	  
	  @Test 
	  void testSetConstituency() { 
		 
		  Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		    candidate.setConstituency("CNG");
		    assertEquals("CNG", candidate.getConstituency());

	  
	  }
	  
	  @Test void testGetAddress() {
		  
		  Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		    String address = candidate.getAddress();
		  assertEquals("UP",address);

		  
		  }
	 
	 /* @Test void testSetAddress() { fail("Not yet implemented"); }
	 * 
	 * @Test void testGetContact() { fail("Not yet implemented"); }
	 * 
	 * @Test void testSetContact() { fail("Not yet implemented"); }
	 * 
	 * @Test void testGetVoteCount() { fail("Not yet implemented"); }
	 * 
	 * @Test void testSetVoteCount() { fail("Not yet implemented"); }
	 */
	  @Test
	  void testToString() { 
		
		    Candidate candidate = new Candidate("Rahul Gandhi", "Congress", 60, "UP", "UP", "9809809808", 10000);
		    String candidateString = candidate.toString();
		    String expectedString = "Candidate [ candidateName=Rahul Gandhi, partyName=Congress, age=60, constituency=UP, address=UP, contact=9809809808, voteCount=10000]";
		    equals(expectedString);

            }
	 

}
