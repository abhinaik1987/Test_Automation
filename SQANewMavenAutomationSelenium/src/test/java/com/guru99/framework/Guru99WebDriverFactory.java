package com.guru99.framework;

import java.net.MalformedURLException;

public class Guru99WebDriverFactory 
{

public static Guru99WebDriverImpl getWebDriverInstance(String BrowserName) throws MalformedURLException 
{
	
	Guru99WebDriverImpl webDriver =new Guru99WebDriverImpl();
	//webDriver.init(BrowserName);
	webDriver.intSauceLabs(BrowserName);
	return webDriver;
	
}
}