package com.atmecs.automating_travelsite.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.atmecs.automating_travelsite.constants.Constants;

public class TakeScreenShots 
{
		public static void takeScreenshot(WebDriver driver, String screenshotName) 
		{
			try 
			{
				File scrnsht = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(scrnsht, new File(Constants.SCREEN_SHOTS+screenshotName+".png"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				
			}
			
		}
}
