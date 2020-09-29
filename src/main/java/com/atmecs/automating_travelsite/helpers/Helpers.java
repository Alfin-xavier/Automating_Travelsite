package com.atmecs.automating_travelsite.helpers;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helpers 
{
	public WebDriver driver;

	public Helpers(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void textData(String xpath)
	{
		driver.findElement(By.xpath(xpath)).sendKeys("");
	}

	public void switchWindow()
	{
		Set<String> ids = driver.getWindowHandles(); 
		Iterator<String> windows = ids.iterator();
		String parentWindow = windows.next();
		String childwindow = windows.next(); 
		driver.switchTo().window(childwindow);
	}
	
	public void selectFromDropDown(String xpath, String value)
	{
		 Select cabinclass = new Select(driver.findElement(By.xpath(xpath)));
		 cabinclass.selectByValue(value);
	}
	public void locatePath(String xpath)
	{
		driver.findElement(By.xpath(xpath));
	}
	public void checkbox(String xpath) 
	{
		WebElement returntrip = driver.findElement(By.xpath(xpath));
		  if(returntrip.isSelected()==false)
			  returntrip.click();
	}
	public void cabinClass(String xpath)
	{
		Wait<WebDriver> wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
		driver.findElement(By.xpath(xpath)).click();
	}

	public void clickOpertaion(String xpath) 
	{
		driver.findElement(By.xpath(xpath)).click();
	}
}
