package com.qa.FeatureFile;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {

	public WebDriver driver = null;
	
	static String current_page = "http://www.practiceselenium.com/welcome.html"; 
	 ExtentReports extent = new ExtentReports ("C:\\Users\\Admin\\Desktop\\report\\name2.html", true);
	 ExtentTest test;
	
	@Given("^the correct web address$")
	public void the_correct_web_address()  {
	    
		//driver.navigate().to("http://www.practiceselenium.com/welcome.html");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\\\chromedriver.exe" );
		driver = new ChromeDriver(); 
	    test = extent.startTest("starting test" );
	    
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page()  {
		
		
		
		driver.get("http://www.practiceselenium.com/welcome.html");
		
		MenuPage mn = PageFactory.initElements(driver,MenuPage.class);
		
		driver.get(Step.current_page); 
		test.log(LogStatus.INFO, "starting website");
		
		mn.get_menu();
		
		test.log(LogStatus.INFO, "open menu page ");
		
		
		Step.current_page = driver.getCurrentUrl();
		
		//driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")).click();
		
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
		
	  // Actions action_1 = new Actions (driver); 
	   
	 //  action_1.sendKeys(Keys.PAGE_DOWN).build().perform();
	 //  action_1.sendKeys(Keys.PAGE_UP).build().perform();
		
	
		driver.get(current_page);
		 MenuPage mn ; 
	     mn = PageFactory.initElements(driver,MenuPage.class);
	     
	     
	     Step.current_page = driver.getCurrentUrl(); 
	     
	     //test.log(LogStatus.INFO, "check menu ");
	     
	     if (mn.lis_menu())
	     {
	    	 test.log(LogStatus.PASS, "passed ");
	     }
	     else 
	     {
	    	 test.log(LogStatus.FAIL, "fail");
	     }
	     
	    assertEquals(true,mn.lis_menu()); 
	    
	    
	    driver.close();
	     	
	    
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button()  {
	 test.log(LogStatus.INFO, "click test ");
		  
		driver.get(current_page);
		MenuPage mn ; 
       mn = PageFactory.initElements(driver,MenuPage.class);
       
       test.log(LogStatus.INFO,"check out buttons ");
       
       Step.current_page = driver.getCurrentUrl(); 
       
       assertEquals(true,mn.check_menu());
		
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page()  {
	    // Write code here that turns the phrase above into concrete actions
		  test.log(LogStatus.INFO, "check the checkout page ");
		driver.get(current_page);
		 MenuPage mn ; 
	       mn = PageFactory.initElements(driver,MenuPage.class);
	       Step.current_page = driver.getCurrentUrl(); 
	     
	     
			mn.click_page();
		//	driver.close();
			
	
			//assertEquals("http://www.practiceselenium.com/check-out.html", driver.getCurrentUrl());
			extent.flush();
	}
	@AfterClass 
	public void end()
	{
	 
	}
}
