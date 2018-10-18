package com.qa.practice;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	static String current_url = "https://www.bing.com/";
	
	public WebDriver driver = null;
	
	ArrayList<String> array = new ArrayList<String>(); 
	
	
	@Given("^Enter search term 'mercury'$")
	public void enter_search_term_mercury() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tinas\\Downloads\\chromedriver.exe" );
	    driver = new ChromeDriver (); 
	   
	}

	@When("^Do search$")
	public void do_search() throws Throwable {
		driver.get("https://www.bing.com/"); // don't use constant because it will open one page ; 
		Search_class mn = PageFactory.initElements(driver,Search_class.class); 
		array.add("mercury"); 
		driver.get(Step.current_url);
		for (String name: array) 
		{
			mn.Search_bar(name);
		}
		
		Step.current_url = driver.getCurrentUrl(); 
		
/*
   @Given("^I am on new user registration page$") 
   public void goToFacebook() { 
      //Intiate web browser instance. driver = new FirefoxDriver();
      driver.navigate().to("https://www.facebook.com/"); 
   } 
	
   @When("^I enter invalid data on the page$") 
   public void enterData(DataTable table){ 
      //Initialize data table 
      List<list> data = table.raw();
      System.out.println(data.get(1).get(1)); 
      
      //Enter data
      driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
      driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
      driver.findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));     
      driver.findElement(By.name("reg_email_confirmation__")).
         sendKeys(data.get(4).get(1)); 
      driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(5).get(1)); 
      
      Select dropdownB = new Select(driver.findElement(By.name("birthday_day"))); 
      dropdownB.selectByValue("15"); 
		
      Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
      dropdownM.selectByValue("6"); 
		
      Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
      dropdownY.selectByValue("1990"); 
		
      driver.findElement(By.className("_58mt")).click(); 
      // Click submit button driver.findElement(By.name("websubmit")).click(); 
   } 
	
   @Then("^User registration should be unsuccessful$") 
   public void User_registration_should_be_unsuccessful() {
      if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/")){
         System.out.println("Test Pass"); 
      } else { 
         System.out.println("Test Failed"); 
      } 
      driver.close(); 
   }
 */
		
		
		
	    
	    
	}
	// String gettext() - shows all text 
	// string gettagname - can be used on all web elements - returns tag name for element 
	// boolean is displayed () - shows if element is visible 
	// boolean is enabled() - return if  element is enable 
	// boolean selected () - returns radiobuttons in select boxes  and check boxes - returns if element is selected now 

	@Then("^Multiple results are shown for 'Mercury may refer to:'$")
	public void multiple_results_are_shown_for_Mercury_may_refer_to(){
		
		driver.get(Step.current_url);
		Search_class mn = PageFactory.initElements(driver,Search_class.class); 
		mn.check_item();
		
		Step.current_url =driver.getCurrentUrl(); 
	    // Write code h
	    
	}

	@Given("^Enter search term 'max'$")
	public void enter_search_term_max() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Multiple results are shown for 'Max may refer to:'$")
	public void multiple_results_are_shown_for_Max_may_refer_to() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


}
