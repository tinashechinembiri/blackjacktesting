package com.qa.ShoopingWebsite;
import static org.junit.Assert.*;

import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class qaconsulting {
	
	public WebDriver driver = null; 
	
	
	@Before 
	public void before ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\\\chromedriver.exe" );
		driver = new ChromeDriver(); 
	}
	@Test 
	public void setup()
	{
		driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/");
		
		WebElement wait_1 = (new WebDriverWait(driver,30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"shafeeq\"]/h2")));
		wait_1.getText(); 
		assertEquals("-The Shafeeq",wait_1.getText() ); 
		
	}
	@After 
	public void tearDown()
	{
		driver.quit();
	}

}
