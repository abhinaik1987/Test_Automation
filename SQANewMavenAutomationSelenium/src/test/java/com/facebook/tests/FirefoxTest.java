package com.facebook.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.examples.config.GlobalDataStore;

public class FirefoxTest
{
 public static void main(String[] args)
 {
  basicTest();
 }
 
 public static void basicTest()
 {
GlobalDataStore gds =new GlobalDataStore();
gds.initParameters();
String GeckoDriver =GlobalDataStore.GeckoDriver_Win;
String HomePage =GlobalDataStore.Homepage;
String ChromeDriver=GlobalDataStore.ChromeDriver_Win;
System.out.println("The HomePage" +HomePage);
System.out.println("The GeckoDriver" +GeckoDriver);
//System.setProperty("webdriver.gecko.driver", GeckoDriver);
System.setProperty("webdriver.chrome.driver",ChromeDriver);
//WebDriver driver =new FirefoxDriver();
WebDriver driver =new ChromeDriver();
//String baseUrl = "http://facebook.com";
String expectedTitle ="Facebook - Log In or Sign Up";
String actualTitle="";
driver.get(HomePage);
actualTitle =driver.getTitle();
actualTitle=actualTitle.trim();
System.out.println("The actual Title is:"+actualTitle);
if (actualTitle.contentEquals(expectedTitle))
{
	System.out.println(" Test Passed");
}
else
{
	System.out.println(" Test Failed");	
}

 }
}