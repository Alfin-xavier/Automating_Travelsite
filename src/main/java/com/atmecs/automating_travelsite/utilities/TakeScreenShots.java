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
	
		public static WebDriver driver;
		
		public TakeScreenShots(WebDriver driver)
		{
			this.driver = driver;
		}
		public static void takeScreenshot(String screenshotName) throws IOException 
		{
			TakesScreenshot screenshot = ((TakesScreenshot) driver);
			
			File source = screenshot.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File(Constants.SCREEN_SHOTS+screenshotName+".png"));
			
		}

}
