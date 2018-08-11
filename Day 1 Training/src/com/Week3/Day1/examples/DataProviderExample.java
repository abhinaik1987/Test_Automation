package com.Week3.Day1.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 
{

	@Test(dataProvider ="getdata")
	
	public void instanceDbProvider(int p1,String p2,String p3)
	{
	System.out.println("Instance DataProvider" +"Example:Data(" +p1 +","+p2+","+p3+")");	
	}
	
	@DataProvider
	
	public Object[][]getdata()
	{
	return new Object[][] {{5,"Five","Two"},{6,"Six","Six1"},{5,"Seven","Seven1"}};
	}

}
