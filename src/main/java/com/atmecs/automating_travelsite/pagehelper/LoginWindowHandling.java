package com.atmecs.automating_travelsite.pagehelper;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.PropertyReader;

public class LoginWindowHandling 
{
	public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	public LoginWindowHandling(WebDriver driver)
	{
		this.driver = driver;
	}
	
	  public void handlingWindowTest(String Username, String PassWord) throws IOException, InterruptedException 
	  { 
		 helpers = new Helpers(driver);
		 
		 locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);
		 
		helpers.clickOpertaion(locatorsFile.getProperty("login"));

		helpers.clickOpertaion(locatorsFile.getProperty("gmail"));
		
		helpers.switchWindow();
	  
		driver.findElement(By.xpath(locatorsFile.getProperty("username"))).sendKeys(Username);
		
		helpers.clickOpertaion(locatorsFile.getProperty("button1"));
		
		driver.findElement(By.xpath(locatorsFile.getProperty("userpassword"))).sendKeys(PassWord);

		helpers.clickOpertaion(locatorsFile.getProperty("button2"));

	  }
}