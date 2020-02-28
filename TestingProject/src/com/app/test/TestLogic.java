package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.logic.Calculations;

public class TestLogic {
	
	
	@Test
	public void testFindmax()
	{
		assertEquals(4,Calculations.findmax(new int[]{5,2,3,4}));
		
		
	}

}
