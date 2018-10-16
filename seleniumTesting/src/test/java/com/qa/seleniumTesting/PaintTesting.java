package com.qa.seleniumTesting;
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
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

public class PaintTesting {
	public WebDriver driver = null; 
	@Before 
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\\\chromedriver.exe" );
		driver = new ChromeDriver(); 
		
	}
	@Test 
	public void draw ()
	{
		driver.get("https://www.youidraw.com/apps/painter/");
		Actions action = new Actions(driver); 
		action.moveByOffset(150,0).perform();
		action.moveByOffset(150, -200).release().perform();
		action.moveByOffset(0,150 ).release().perform();
	}
	
	
	
	@After 
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
