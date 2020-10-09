package com.atmecs.automating_travelsite.tests;

import org.testng.annotations.Test;
import com.atmecs.automating_travelsite.basetest.BaseTest;
import com.atmecs.automating_travelsite.pagehelper.SearchingFlights;
import com.atmecs.automating_travelsite.utilities.DataProviderClass;

public class SearchingFlight extends BaseTest
{

	@Test(dataProvider = "search_flight", dataProviderClass= DataProviderClass.class)
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