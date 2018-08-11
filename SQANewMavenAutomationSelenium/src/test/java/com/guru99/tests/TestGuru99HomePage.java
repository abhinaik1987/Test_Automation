package com.guru99.tests;

import java.net.MalformedURLException;
import org.apache.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.examples.config.GlobalDataStore;
import com.examples.page.Guru99HomePage;
import com.guru99.framework.Guru99WebDriverFactory;
import com.guru99.framework.Guru99WebDriverImpl;

public class TestGuru99HomePage 
{
	final static Logger logger =Logger.getLogger("GURU99_TESTS");

	Guru99WebDriverImpl driver;
	GlobalDataStore gds =new GlobalDataStore();
	String BankHomePage;
	Boolean HomePageLaunch =false;
	Guru99HomePage objHomePage;
	
	@Parameters({"BrowserName"})
	@BeforeClass
public void setup(@Optional("Firefox")String BrowserName) throws MalformedURLException
	{
	//System.out.println("START: In Set -Up Method");
	logger.info("START: In Set up Method");
	GlobalDataStore.setLogCategory("GURU99_TESTS");
	gds.initParameters();
	driver =Guru99WebDriverFactory.getWebDriverInstance(BrowserName);
	BankHomePage=GlobalDataStore.Guru99HomePage;
	HomePageLaunch=driver.navigateTo(BankHomePage);
	objHomePage =new Guru99HomePage();
	objHomePage.setLogCategory("GURU99_TESTS");
	objHomePage.setWebDriver(driver);
	logger.info("END: In Set-up Method");
}
	
@Test

public void test_Home_Page_DashBoard_UserName()
{
	System.out.println("START: Test_Home_Page_DashBoard_UserName");
	//Assert.assertTrue(HomePageLaunch);
	if(HomePageLaunch==true)
	{
		String loginPageTitle =objHomePage.getHomePageDashboardUserName();
		System.out.println(" The Login Title is:" +loginPageTitle);
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank") );
	}
}
/*
@Test
public void Steps_To_Generate_Access()
{
	System.out.println("START: Steps_To_Generate_Access");
	//Assert.assertTrue(HomePageLaunch);
	if(HomePageLaunch==true)
	{
		String loginPageTitle1 =objHomePage.StepsToGenerateAccess();
		logger.info(" The Text of the Result is :" +loginPageTitle1);
		logger.info(" END: Steps_To_Generate_Access");
		//System.out.println(" The Login Title is:" +loginPageTitle1);
		Assert.assertTrue(loginPageTitle1.contains("Steps to Generate Access"));
	}	
}

@Test
public void checkCreateAccountisEnabled()
{
	System.out.println("START: Steps_To_Generate_Access");
	//Assert.assertTrue(HomePageLaunch);
	if(HomePageLaunch==true)
	{
		String loginPageTitle1 =objHomePage.StepsToGenerateAccess();
		logger.info(" The Text of the Result is :" +loginPageTitle1);
		logger.info(" END: Steps_To_Generate_Access");
		//System.out.println(" The Login Title is:" +loginPageTitle1);
		Assert.assertTrue(loginPageTitle1.contains("Steps to Generate Access"));
	}		
}
*/
@AfterClass
public void teardown()
{
	this.driver.quitDriver();
}
}
