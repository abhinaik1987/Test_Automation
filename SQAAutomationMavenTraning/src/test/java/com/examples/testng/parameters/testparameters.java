package com.examples.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testparameters {
	
	@Parameters({"first-name"})
	@Test
	public void testSingleString(String firstname)
	{
		System.out.println(" Invoked teststring "+firstname);
		assert"Cedric".equals(firstname);
	}

}
