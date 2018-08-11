package com.guru99.framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.examples.config.GlobalDataStore;

public class Guru99WebDriverImpl implements Guru99Webdriver
{

WebDriver driver;

public void intSauceLabs(String BrowserName) throws MalformedURLException
{
 String USERNAME="abhinaik138";
 String ACCESS_KEY ="0402e99f-517f-4437-a4f6-d6501199b951";
 String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
 DesiredCapabilities capabilities =new DesiredCapabilities();
 
 capabilities.setCapability(CapabilityType.BROWSER_NAME, BrowserName);
 capabilities.setCapability("platform", "Windows");
 capabilities.setCapability("version","61.0" );
 driver = new RemoteWebDriver(new URL(URL),capabilities);
}
	
public String OSDetector()
{
 String os = System.getProperty("os.name").toLowerCase();
 if (os.contains("win"))
 { return "Windows";
 } else if (os.contains("nux") || os.contains("nix"))
 {
	
 return "Linux";
} else if (os.contains("mac"))
{ 
	return "Mac";
} else if (os.contains("sunos"))
{ 
	return "Solaris";
} else {
	return "Other";
}
}


public void init(String Browser)
{
System.out.println(" The Webdriver Init Method" +Browser);	
String UserDir =System.getProperty("user.dir");
String OS =OSDetector();

if (Browser.equalsIgnoreCase("chrome")&& (OS.equals("Windows")))
{
	//System.out.println("The Chrome Driver "+GlobalDataStore.ChromeDriver_Win);
	System.setProperty("webdriver.chrome.driver", UserDir+GlobalDataStore.ChromeDriver_Win);
	ChromeOptions options =new ChromeOptions();
	options.addArguments("disable-infobars");
	options.addArguments("--start-maximized");
	driver =new ChromeDriver(options);
	
}

if (Browser.equals("Firefox")|| (Browser.equals("firefox")))
{
System.out.println("Coming in Firefox");	
if (OS.equals("Windows"))
{
	System.out.println(" In Fire Fox Driver");
	System.setProperty("webdriver.gecko.driver",UserDir+GlobalDataStore.GeckoDriver_Win);
	driver =new FirefoxDriver(); 
}
}
}
@Override
public Boolean navigateTo( final String urlString) {
	Boolean mainPageFound =false;
	try
	{
	 System.out.println(" The Navigate URL +urlString");
	 String navigateUrl;
	 navigateUrl =urlString;
	 this.driver.get(navigateUrl);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 String CurrentUrl =getCurrentURL();
	 driver.manage().window().maximize();
	 if (CurrentUrl!=null)
		 mainPageFound =true;
	}catch (Exception e) {
		e.printStackTrace();
		return false;
	}
	 return mainPageFound;
}

public String getCurrentURL() {
	String currentUrl =driver.getCurrentUrl();
	return currentUrl;
}

public WebDriver getDriverInstance()
{
	return driver;
}


@Override
public void quitDriver() {
	if (this.driver !=null) {
		this.driver.quit();
		this.driver =null;
	}
	
}


public void closeBrowser() {

System.out.println("Close Browser");
this.driver.close();
	
}






public WebElement FindElement(By element) {
	System.out.println("Come in Find Element");
	if(driver.findElement(element).isDisplayed()) {
		System.out.println("The Element exists");
		return driver.findElement(element);
	}
	else {
	return null;
}


}


public String getElementText(By element) {
	try {
	if(driver.findElement(element).isDisplayed())	
		System.out.println("The Element Exists");
	return driver.findElement(element).getText();
	}
	catch(NoSuchElementException e) {
	 e.getStackTrace();	
	}
	return null;
}



public List<WebElement> findElements(By element) {

	return driver.findElements(element);
}



public void clickElement(WebElement element) {
	
	System.out.println("START: click Element value "+element);
	WebDriverWait wait = new WebDriverWait(driver, 15);
	try {
        //System.out.println("The element is " +element.getText());
        
        //Wait.someSec(GlobalDataStore.WAIT_TIME);
		WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(element));
		clickableElement.click();
		
	} catch (StaleElementReferenceException e) {

		System.out.println("Element  " + element.getText() + "Does not exist " + e.getStackTrace());

	} catch (NoSuchElementException e) {

		System.out.println("Element  " + element.getText() + "Does not exist " + e.getStackTrace());
	} catch (Exception e) {
		
		System.out.println("Element does not exist " + e.getStackTrace());
	}
	
	System.out.println("END: click Element ");

}



}