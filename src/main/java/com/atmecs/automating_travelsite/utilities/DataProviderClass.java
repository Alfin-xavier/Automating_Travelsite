package com.atmecs.automating_travelsite.utilities;

import org.testng.annotations.DataProvider;

import com.atmecs.automating_travelsite.constants.Constants;

public class DataProviderClass 
{
	@DataProvider(name = "search_flight")
	public Object[][] readContactData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData(Constants.SEARCH_DATAS,"Searching_Flights");
		
		return data;
		
	}
	
	@DataProvider(name = "login")
	public Object[][] readLoginData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData(Constants.LOGIN_DATAS,"Login_credentials");
		
		return data;
		
	}

}
