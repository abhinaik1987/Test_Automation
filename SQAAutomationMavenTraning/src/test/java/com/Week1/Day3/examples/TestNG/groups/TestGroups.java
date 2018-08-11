package com.Week1.Day3.examples.TestNG.groups;

import org.testng.annotations.Test;

public class TestGroups {

    @Test(groups= {"functest", "checkintest"})
	public void testMethod1()
	{

	}
	@Test(groups= {"functest", "checkintest"})
	public void testMethod2()
	{
		
	}
    
	@Test(groups= {"functest"})
	public void testMethod3()
	{

    }
}