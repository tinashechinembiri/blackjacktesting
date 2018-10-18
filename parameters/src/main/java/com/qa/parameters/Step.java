package com.qa.parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;

public class Step {
	
	public WebDriver driver = null; 
	static String current_page = Constant.bing_url;  
	String atr_1 = "";
	
@Before
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\\\chromedriver.exe" );
	driver = new ChromeDriver(); 
}

@Given("^I go to \"([^\"]*)\" website$")
public void i_go_to_website(String arg1) throws Throwable {
driver.get(arg1);	
	
   
}

@When("^I search for \"([^\"]*)\"$")
public void i_search_for(String arg1) throws Throwable {
	
	SearchClass mn = PageFactory.initElements(driver,SearchClass.class); 
	mn.search().sendKeys(arg1);
	
	mn.search().submit();
    
	atr_1 = arg1; 
    throw new PendingException();
    
}

@Then("^I am taken to a list of data for that search$")
public void i_am_taken_to_a_list_of_data_for_that_search() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	//Step.current_page = driver.getCurrentUrl(); 
	//System.out.println(Step.current_page);
	SearchClass mn = PageFactory.initElements(driver,SearchClass.class); 
	
	assertEquals(atr_1, mn.feature_search());
	
	
   
}


}
