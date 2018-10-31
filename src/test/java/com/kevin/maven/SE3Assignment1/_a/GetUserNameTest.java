package com.kevin.maven.SE3Assignment1._a;

import org.joda.time.DateTime;
import org.joda.time.Years;

import junit.framework.Test;
import junit.framework.TestCase;

public class GetUserNameTest extends TestCase {
	
	private String Name = "joe Bloggs";
	private String ID = "A4fJS"; 
	private DateTime DOB = new DateTime(1997,12,04,2,1,0,0);
	
	
	public void testGetUsername() {
		
		Student testStudent = new Student(Name, ID,DOB);
		
		// Test
		String testUsername = testStudent.getUsername();
		Years tempAge = Years.yearsBetween(DOB.toLocalDate(), DateTime.now().toLocalDate());
		int IntAgeTemp = tempAge.getYears();
		
		// Verify
		assertEquals(Name+IntAgeTemp , testUsername);
	}

}






