package com.qa;

// Test Class

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class IHateYouTest
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
		Class2 waitPage = PageFactory.initElements(driver, Class2.class);
		System.out.println(waitPage.getElement(driver).getText());
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}
}