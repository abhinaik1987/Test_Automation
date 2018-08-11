package com.examples.page;

import javax.swing.text.Element;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.guru99.framework.Guru99WebDriverImpl;

public class Guru99HomePage
{
Guru99WebDriverImpl driver;
By homePageUserName =By.xpath("//h2[@class='barone']");
By homePageNewText =By.xpath("//h4[@class='barone']");
By CheckLinksToGenrateAccess =By.xpath("//a[@href='http://demo.guru99.com']");
public static String LogCategory;
public static Logger logger;


public static void setLogCategory(String LogFile) {
	LogCategory =LogFile;
	logger =Logger.getLogger(LogCategory);
}


public void setWebDriver(Guru99WebDriverImpl webDriver)	
{  
	this.driver=webDriver;
}

	
public String getHomePageDashboardUserName()
{
	logger.info("START: getHomePageDashboardUserName");
System.out.println("Coming Here");
logger.info("END: getHomePageDashboardUserName");
return driver.getElementText(homePageUserName);
}

public String StepsToGenerateAccess()
{
	logger.info("START: StepsToGenerateAccess");
System.out.println("Coming Here");
logger.info("END: StepsToGenerateAccess");
return driver.getElementText(homePageNewText);
}

public Boolean checkCreateAccountisEnabled()
{
System.out.println();
return driver.FindElement(CheckLinksToGenrateAccess).isEnabled();
}

/*
public void ClickSeleniumDropDownOnPage()
{
	WebElement element =driver.FindElement(checkSeleniumDropDown);
	driver.clickElement(element);
}

*/


public void clickSeleniumSelectElementFromDropdown()
{
	Select sel1= new Select(driver.FindElement(By.xpath("//ul[@class='nav navbar-nav']/li[@class='dropdown open']/a[@class='dropdown-toggle']")));
	sel1.selectByVisibleText("Selenium");
	sel1.selectByIndex(1);
}

}