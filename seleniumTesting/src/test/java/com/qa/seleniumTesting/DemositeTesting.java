package com.qa.seleniumTesting;
import java.io.IOException;

import static org.junit.Assert.*;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
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

public class DemositeTesting {
	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	public WebDriver driver = null; 
	static ExtentReports extent = new ExtentReports ("C:\\Users\\Admin\\Desktop\\report\\name.html", true); 
	ExtentTest test; 
	@BeforeClass 
	public static void before ()
	{
		
		//ExtentTest test; 
	}
	
	@Before 
	public void setup ()
	{
		Demomainexcel.setExcileFile(Constant.excel_link,0);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\\\chromedriver.exe" );
		driver = new ChromeDriver(); 
		
		
		
	}
	@Test 
	public void createuser() throws InterruptedException,IOException 
	{
		
		for (int i =1; i < Demomainexcel.getExcelWSheet().getPhysicalNumberOfRows(); i++)
		{
			test =   extent.startTest("Excel data start "+i);
			
			driver.get(Constant.websiteurl);
			test.log(LogStatus.INFO, "browser started");
			
			String user_id = Demomainexcel.getdata(i, 0); 
			String password = Demomainexcel.getdata(i, 1);
			String expected = Demomainexcel.getdata(i, 2);
			 
			
			DemoMain mn = PageFactory.initElements(driver,DemoMain.class);
			mn.input(user_id );
			mn.input_2(password);
			test.log(LogStatus.INFO, "login details");
			DemoLogin mw = PageFactory.initElements(driver,DemoLogin.class);
			mw.login_username(user_id);
			mw.login_password(password);
			
			
			if (!mw.get_username().equals(expected))
			{
				test.log(LogStatus.FAIL, "the apllication failed");
			}
			
			test.log(LogStatus.PASS, "The aplication has passed");
			Demomainexcel.setData("pass", i, 4);
			assertEquals(expected, mw.get_username()); 
			
		
			
			
			}
	
		
		
		
		//driver.get(Constant.websiteurl);
		
		//DemoMain mn = PageFactory.initElements(driver,DemoMain.class);
		//mn.input("1234");
		//mn.input_2("1234");
		//assertEquals("1234",mn.get_username().getText());
		//assertEquals ("1234", mn.get_password().getText()); 
		//test.log(LogStatus.INFO, "login browser started");
		//DemoLogin mw = PageFactory.initElements(driver,DemoLogin.class);
		//mw.login_username("1234");
		//mw.login_password("1234");
		//assertEquals("1234",mw.get_username().getText());
		//assertEquals("1234",mw.get_password().getText());
		//if (mw.get_username().equals("**Successful Login**"))
		//{
			//test.log(LogStatus.PASS, "test has passed");
		//}
		//else
		//{
			//test.log(LogStatus.FAIL, "test has failed");
		//}
		
		
		//assertEquals("**Successful Login**",mw.get_username()); 
		
		
		//extent.endTest("Test end");
		}
	
	@After 
	public void tearDown()
	{
		driver.quit();
	}
	@AfterClass 
	public static void end ()
	{
		extent.flush(); 
	}
	

}
