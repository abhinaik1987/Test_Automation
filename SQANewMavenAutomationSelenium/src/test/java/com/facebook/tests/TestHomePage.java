package com.facebook.tests;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.examples.config.GlobalDataStore;
import com.examples.page.FaceBookHomePage;

public class TestHomePage 
{
	GlobalDataStore gds =new GlobalDataStore();
	String GeckoDriver;
	WebDriver driver =null;
	String HomePage;
	String ChromeDriver;
	FaceBookHomePage FBPage;
	
@Parameters({"BrowserName", "HomePage"})	
@BeforeClass
public void setup(@Optional("FireFox")String BrowserName ,String HomePage)
{
System.out.println("The BrowserName....");	
System.out.println(" The Browser Name"+BrowserName);
gds.initParameters();
String basedir =System.getProperty("user.dir");
System.out.println("The basedir is" +basedir);
GeckoDriver =GlobalDataStore.GeckoDriver_Win;
this.HomePage=HomePage;
System.out.println("The HomePage "+HomePage);
System.out.println(" The GeckoDriver "+GeckoDriver);
if(BrowserName.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.gecko.driver", GeckoDriver);
driver= new FirefoxDriver();
FBPage =new FaceBookHomePage(driver);
FBPage.launchHomePage(HomePage);
}

else if(BrowserName.equalsIgnoreCase("chrome"))
{
	System.out.println("The Chrome Driver "+GlobalDataStore.ChromeDriver_Win);
	System.setProperty("webdriver.chrome.driver", GlobalDataStore.ChromeDriver_Win);
	ChromeOptions options =new ChromeOptions();
	options.addArguments("disable-infobars");
	options.addArguments("--start-maximized");
	driver =new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
}	
}	
@Test
public void testFacebookTitleOnPageload()
{
String expectedTitle ="Facebook - Log In or Sign Up";
String actualTitle="";
FBPage =new FaceBookHomePage(driver);
FBPage.launchHomePage(HomePage);
//driver.get(HomePage);
actualTitle =driver.getTitle();
actualTitle=actualTitle.trim();
System.out.println("The actual Title is:"+actualTitle);
Assert.assertEquals(actualTitle, expectedTitle);

}

@Test
@Parameters({"Username", "Password"})
public void testuserLogin(String Username ,String Password)
{
	System.out.println(" The Username is" +Username);	
	System.out.println(" The Password is"+Password);
	//FBPage =new FaceBookHomePage(driver);
	//FBPage.launchHomePage(HomePage);
	driver.findElement(By.id("email")).sendKeys(Username);
	driver.findElement(By.id("pass")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
}
@Test
public void CreateAccount()
{
//WebElement element =driver.findElement(By.xpath("//h2[contains(text() ,'Sign Up')]"));
//WebElement element1 =driver.findElement(By.xpath("//h2[contains(text() ,'Connect with friends')]"));
WebElement element3 =driver.findElement(By.linkText("Forgot account?"));
element3.click();
//System.out.println(" Element is "+element.getText());
//System.out.println(" Element is "+element1.getText());
//String actualTitle =element.getText().trim();
//String actualTitle1 =element1.getText().substring(0, 20).trim();
//String ExpectedTitle= "Sign Up";
//String ExpectedTitle1= "Connect with friends";
//Assert.assertEquals(actualTitle, ExpectedTitle);
//Assert.assertEquals(actualTitle1, ExpectedTitle1);
}
@Test
@Parameters({"sFirstName", "sLastName"})
public void testUserRegistration(String sFirstName,String sLastName)
{
System.out.println("The first name: "+sFirstName);	
System.out.println("The Password: "+sLastName);
driver.findElement(By.name("firstname")).sendKeys(sFirstName);
driver.findElement(By.name("lastname")).sendKeys(sLastName);
driver.findElement(By.name("reg_email__")).sendKeys("888-99-888");
Select sel1= new Select(driver.findElement(By.xpath(".//*[@id='month']")));	
sel1.selectByVisibleText("Mar");
Select sel2= new Select(driver.findElement(By.xpath(".//*[@id='day']")));	
sel2.selectByValue("6");
Select sel3= new Select(driver.findElement(By.xpath(".//*[@id='year']")));	
sel3.selectByIndex(3);
//driver.findElement(By.name("reg_email__"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(), 'Female')]")));
		element.click();
		WebElement signUp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Sign Up')]")));
		signUp.click();
}
}