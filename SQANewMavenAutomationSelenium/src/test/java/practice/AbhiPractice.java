package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.examples.config.GlobalDataStore;



public class AbhiPractice {

	public static void main(String[] args) 
	{
		newTest();

	}

	public static void newTest()
	{
		GlobalDataStore gds =new GlobalDataStore();
		gds.initParameters();
		String GeckoDriver =GlobalDataStore.GeckoDriver_Win;
		String HomePage =GlobalDataStore.Homepage;
		//String ChromeDriver=GlobalDataStore.ChromeDriver_Win;
		System.out.println("The HomePage" +HomePage);
		System.out.println("The GeckoDriver" +GeckoDriver);
		System.setProperty("webdriver.gecko.driver", GeckoDriver);
		//System.setProperty("webdriver.chrome.driver",ChromeDriver);
		WebDriver driver =new FirefoxDriver();
		String ExpectedTitle="Salesforce.com: The Customer Success Platform To Grow Your Business";
		String ActualTitle ="";
		driver.get(HomePage);
		ActualTitle =driver.getTitle().trim();
		System.out.println("The Actual Title is:"+ActualTitle);
		System.out.println("The Expected Title is:"+ExpectedTitle);
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	}
}
