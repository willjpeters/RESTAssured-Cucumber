package com.qa;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IHateYouExplicit
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
			WebElement myDynamicElement = (new WebDriverWait(driver, 5)) .until(ExpectedConditions.presenceOfElementLocated(By.id("shafeeq"))); 
		}
		
		@After
		public void teardown()
		{
			driver.quit();
		}
}
