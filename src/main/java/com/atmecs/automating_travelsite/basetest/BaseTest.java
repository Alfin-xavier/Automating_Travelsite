package com.atmecs.automating_travelsite.basetest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.utilities.PropertyReader;
import com.atmecs.automating_travelsite.utilities.TestNGListeners;

public class BaseTest 
{
	public	WebDriver driver;
	Properties properties;
	String baseUrl;
	String browserUrl;
	
	@BeforeMethod
	public void beforeTest() throws InterruptedException, IOException 
	{
		properties = PropertyReader.readProperties(Constants.CONFIG);
		baseUrl = properties.getProperty("url");
		browserUrl = properties.getProperty("browser");
		
		System.setProperty(Constants.USER_DIR, Constants.CHROME_PATH);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(), baseUrl);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		
		TestNGListeners.driver = driver;

	}

	@AfterMethod
	public void afterTest() 
	{
		driver.close();

	}
}