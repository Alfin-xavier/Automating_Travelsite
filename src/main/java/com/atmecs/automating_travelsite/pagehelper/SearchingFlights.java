package com.atmecs.automating_travelsite.pagehelper;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.PropertyReader;

public class SearchingFlights 
{
	public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	public SearchingFlights(WebDriver driver)
	{
		this.driver = driver;
	}

	public void twoWayTripSelectionTest(String Source, String Destination) throws InterruptedException 
	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);
		
		helpers.checkbox(locatorsFile.getProperty("roundtrip"));

		driver.findElement(By.xpath(locatorsFile.getProperty("source"))).sendKeys(Source);

		driver.findElement(By.xpath(locatorsFile.getProperty("destination"))).sendKeys(Destination);

		helpers.clickOpertaion(locatorsFile.getProperty("date1"));

		helpers.clickOpertaion(locatorsFile.getProperty("departdate"));

		helpers.clickOpertaion(locatorsFile.getProperty("date2"));

		helpers.clickOpertaion(locatorsFile.getProperty("returndate"));

		helpers.clickOpertaion(locatorsFile.getProperty("checkbox"));

		helpers.clickOpertaion(locatorsFile.getProperty("searchflight"));

	}

}
