package com.atmecs.automating_travelsite.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.atmecs.automating_travelsite.basetest.BaseTest;
import com.atmecs.automating_travelsite.pagehelper.LoginWindowHandling;
import com.atmecs.automating_travelsite.utilities.DataProviderClass;

public class HandlingWindow extends BaseTest
{
	
	@Test(dataProvider = "login", dataProviderClass= DataProviderClass.class)
	public void handlingWindow(String Username, String PassWord)
	{
		LoginWindowHandling login = new LoginWindowHandling(driver);

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