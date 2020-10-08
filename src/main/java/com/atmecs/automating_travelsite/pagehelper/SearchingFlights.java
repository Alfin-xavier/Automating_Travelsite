package com.atmecs.automating_travelsite.pagehelper;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.helpers.Helpers;
import com.atmecs.automating_travelsite.utilities.Logging;
import com.atmecs.automating_travelsite.utilities.PropertyReader;

public class SearchingFlights 
{
	public WebDriver driver;
	
	Helpers helpers;
	
	Properties data;
	
	Properties locatorsFile;
	
	Logging log;
	
	public SearchingFlights(WebDriver driver)
	{
		this.driver = driver;
	}

	public void twoWayTripSelectionTest(String Source, String Destination) throws InterruptedException 
	{
		helpers = new Helpers(driver);

		locatorsFile = PropertyReader.readProperties(Constants.LOCATORS);
		
		log = new Logging();
		
		helpers.checkbox(locatorsFile.getProperty("roundtrip"));
		
		log.info("Select RoundTrip");

		driver.findElement(By.xpath(locatorsFile.getProperty("source"))).sendKeys(Source);
		
		log.info("Select Source");

		driver.findElement(By.xpath(locatorsFile.getProperty("destination"))).sendKeys(Destination);
		
		log.info("Select Destination");

		helpers.clickOpertaion(locatorsFile.getProperty("date1"));
		
		log.info("Clicking Date");

		helpers.clickOpertaion(locatorsFile.getProperty("departdate"));
		
		log.info("Select Depature Date");

		helpers.clickOpertaion(locatorsFile.getProperty("date2"));
		
		log.info("Clicking Date");

		helpers.clickOpertaion(locatorsFile.getProperty("returndate"));
		
		log.info("Select Return Date");

		helpers.clickOpertaion(locatorsFile.getProperty("checkbox"));
		
		log.info("Select checkbox");

		helpers.clickOpertaion(locatorsFile.getProperty("searchflight"));
		
		log.debug("Clicking on the Search Button");

	}

}