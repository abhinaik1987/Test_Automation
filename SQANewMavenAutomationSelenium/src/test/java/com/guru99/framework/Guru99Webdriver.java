package com.guru99.framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Guru99Webdriver
{
	void init(String Browser);
	Boolean navigateTo(final String relativeURL);
	void quitDriver();
	void closeBrowser();
	WebElement FindElement(By element);
	String getElementText(By element);
	List<WebElement> findElements(By element);
	void clickElement(WebElement element);
}
