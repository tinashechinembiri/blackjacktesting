package com.qa.ShoopingWebsite;
import java.io.IOException;

import static org.junit.Assert.*;

import java.io.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.*; 

public class ShoppingTest {
	public WebDriver driver = null; 
	static ExtentReports extent = new ExtentReports ("C:\\Users\\Admin\\Desktop\\report\\name.html", true); 
	ExtentTest test; 
	
	@Before 
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\\\chromedriver.exe" );
		driver = new ChromeDriver(); 
	}
	@Test 
	public void search ()
	{
		test = extent.startTest("start test for search bar  "); 
		driver.get("http://automationpractice.com/index.php");
		test.log(LogStatus.INFO, "bowser has started ");
		
		ShoppingSearch ss = PageFactory.initElements(driver, ShoppingSearch.class); 
		
		ss.search("dress");
		if (ss.text_1().equals("dress"))
		{
			test.log(LogStatus.PASS, "test has passed");
		}
		else
		{
			test.log(LogStatus.FAIL, "test has failed");
		}
		
		
		assertEquals("dress", ss.text_1()); 
	}
	
	@After
	public void teardown()
	{
		driver.quit();
	}
	@AfterClass 
	public static void end ()
	{
		extent.flush(); 
	
	}
	
	

}
