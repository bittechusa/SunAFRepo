package com.bit.test;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		DOMConfigurator.configure("log4j.xml");
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void after()
	{
		driver.close();
		
	}

}
