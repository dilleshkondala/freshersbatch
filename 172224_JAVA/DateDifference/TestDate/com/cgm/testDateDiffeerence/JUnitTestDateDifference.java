package com.cgm.testDateDiffeerence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.cgm.dateService.DateDifferenceProvider;
import com.cgm.dateServiceSupport.MyDate;

public class JUnitTestDateDifference {
	
	DateDifferenceProvider diff;
	
	@Before
	public void init()
	{
		diff = new DateDifferenceProvider();
	}
	
	@Test
	public void testDateDifference() {
		long days = DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(06, 04, 2011));
		assertEquals(days, 0);
		
	}

}
