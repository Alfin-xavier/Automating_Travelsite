package com.atmecs.automating_travelsite.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.automating_travelsite.basetest.BaseTest;
import com.atmecs.automating_travelsite.constants.Constants;
import com.atmecs.automating_travelsite.pagehelper.SearchingFlights;
import com.atmecs.automating_travelsite.utilities.ReadDataFromExcel;

public class SearchingFlight extends BaseTest
{
	@DataProvider(name = "readData")
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData(Constants.SEARCH_DATAS,"Searching_Flights");
		
		return data;
	}
	
	@Test(dataProvider = "readData")
	public void searchingFlight(String Source, String Destination) 
	{
		SearchingFlights search = new SearchingFlights(driver);
		
		try 
		{
			search.twoWayTripSelectionTest(Source, Destination);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}