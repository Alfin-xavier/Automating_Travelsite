package com.atmecs.automating_travelsite.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.atmecs.automating_travelsite.basetest.BaseTest;
import com.atmecs.automating_travelsite.pagehelper.LoginWindowHandling;
import com.atmecs.automating_travelsite.utilities.ReadDataFromExcel;

public class HandlingWindow extends BaseTest
{
	
	@DataProvider(name = "readData")
	public Object[][] readData()
	{
		Object[][] data = ReadDataFromExcel.readExcelData("Login_credentials");
		
		return data;
		
	}
	
	@Test(dataProvider = "readData")
	public void handlingWindow(String Username, String PassWord)
	{
		LoginWindowHandling login = new LoginWindowHandling(driver);
		
		System.out.println(Username+"\n"+PassWord);

		try 
		{
			login.handlingWindowTest(Username, PassWord);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

	}
}
