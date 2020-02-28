package com.app.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssumptionTest {

	@Test
	void testOnDev()
	{
	    System.setProperty("ENV", "DEV");
	    Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	    //remainder of test will proceed
	}
	  
	@Test
	void testOnProd()
	{
	    System.setProperty("ENV", "PROD");
	    Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	    //remainder of test will be aborted
	}

}
