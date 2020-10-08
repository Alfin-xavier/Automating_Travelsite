package com.atmecs.automating_travelsite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.Logging;
import com.atmecs.automating_travelsite.utilities.PropertyReader;

public class LoginWindowHandling 
{
	public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	Logging log;
	
	public LoginWindowHandling(WebDriver driver)
	{
		this.driver = driver;
	}
	
	  public void handlingWindowTest(String Username, String PassWord) throws IOException, InterruptedException 
	  { 
		 helpers = new Helpers(driver);
		 
		 log = new Logging();
		 
		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);
		 
		helpers.clickOpertaion(locatorsFile.getProperty("login"));
		
		log.info("Clicking on the Login linktext");

		helpers.clickOpertaion(locatorsFile.getProperty("gmail"));
		
		log.info("Clicking login with gmail");
		
		helpers.switchWindow();
		
		log.info("Switching Window");
	  
		driver.findElement(By.xpath(locatorsFile.getProperty("username"))).sendKeys(Username);
		
		log.info("Providing Username");
		
		helpers.clickOpertaion(locatorsFile.getProperty("button1"));
		
		log.debug("Clicking the next button");
		
		driver.findElement(By.xpath(locatorsFile.getProperty("userpassword"))).sendKeys(PassWord);
		
		log.info("Providing Password");

		helpers.clickOpertaion(locatorsFile.getProperty("button2"));
		
		log.debug("Clicking the next button");

	  }
}