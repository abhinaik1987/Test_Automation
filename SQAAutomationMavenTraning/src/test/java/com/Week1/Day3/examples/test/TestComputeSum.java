package com.Week1.Day3.examples.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Week1.Day3.examples.ComputeSum;

public class TestComputeSum
{
 @Test(groups= {"checkintest"})
	public void testsumnumbers() 
	{
	int result =ComputeSum.sumnumbers(10,20);
	Assert.assertEquals(result, 30);

	}

}
