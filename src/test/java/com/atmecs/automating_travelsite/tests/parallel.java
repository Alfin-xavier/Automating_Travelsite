package com.atmecs.automating_travelsite.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class parallel 
{
	  public WebDriver driver;

	       String url = "http://sites.ecanarys.com/Nopcommercesite";

	       @Parameters ({"browser"})

	       @BeforeTest

	       public void preCondition(String browser)

	       {

	              try

	              {

	                     if(browser.equalsIgnoreCase("Firefox"))

	                     {

	                           driver = new FirefoxDriver();

	                     }

	                     if(browser.equalsIgnoreCase("Chrome"))

	                     {

	                           //Location of the chromedriver.exe file stored in your machine

	                            System.setProperty("webdriver.chrome.driver","D:/ exefiles/chromedriver.exe");

	                           driver = new ChromeDriver();

	                     }

	                     if(browser.equalsIgnoreCase("IE"))

	                     {

	                           //Location of the IEDriverServer.exe file stored in your machine               

	System.setProperty("webdriver.ie.driver","D:/ IEDriverServer.exe");

	                           driver = new InternetExplorerDriver();

	                     }                   

	              }

	              catch (WebDriverException e)

	              {

	                     System.out.println("Browser not found" +e.getMessage());

	              }

	              driver.get(url);

	              driver.manage().window().maximize();

	              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	       }

	       @Test

	       public void addToCart() throws InterruptedException

	       {

	              //Clicking on Cement link on the home page

	              driver.findElement(By.partialLinkText("Cement")).click();

	              WebElement ele = driver.findElement(By.cssSelector("a[href='/Nopcommercesite/maha-shakthi-ppc']"));

	              Actions action = new Actions(driver);

	              action.moveToElement(ele).click().perform();

	              //Clicking on "Add to Wishlist button

	              driver.findElement(By.id("add-to-wishlist-button-1465")).click();

	              //Clicking on the wishlist button on the confirmation pop up

	              driver.findElement(By.xpath("//input[@class='button-1 productAddedToCartWindowCheckout']")).click();

	              //Getting the count on the wishlist field

	              String whishlistCount = driver.findElement(By.xpath("//span[@class='wishlist-qty']")).getText();

	              //Printing the Count on the Whishlist field

	              System.out.println("Whishlist count: " +whishlistCount );

	              driver.quit();     
	}
}
