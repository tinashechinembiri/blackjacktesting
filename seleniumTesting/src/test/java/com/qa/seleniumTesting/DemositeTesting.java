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
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

public class DemositeTesting {
	
	public WebDriver driver = null; 
	
	@Before 
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\\\chromedriver.exe" );
		driver = new ChromeDriver(); 
		
	}
	@Test 
	public void createuser() throws InterruptedException,IOException 
	{
		driver.get("http://thedemosite.co.uk/addauser.php");
		DemoMain mn = PageFactory.initElements(driver,DemoMain.class);
		mn.input("1234");
		mn.input_2("1234");
		//assertEquals("1234",mn.get_username().getText());
		//assertEquals ("1234", mn.get_password().getText()); 
		
		DemoLogin mw = PageFactory.initElements(driver,DemoLogin.class);
		mw.login_username("1234");
		mw.login_password("1234");
		//assertEquals("1234",mw.get_username().getText());
		//assertEquals("1234",mw.get_password().getText());
		
		assertEquals("**Successful Login**",mw.get_username()); 
		
		
		
		}
	
	@After 
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
