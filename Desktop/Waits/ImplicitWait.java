package com.qa;

import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IHateYouImplicit 
{

		public WebDriver driver = null;
		
		@Before
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		@Test
		public void test1()
		{
			driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/"); 
			WebDriver driver = new ChromeDriver(); driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
			driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/"); 
			WebElement myDynamicElement = driver.findElement(By.id("shafeeq")); 

		}
		
		@After
		public void teardown()
		{
			driver.quit();
	}
}
