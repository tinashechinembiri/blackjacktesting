package com.qa.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_class {
	
	@FindBy (xpath = "//*[@id=\"sb_form_q\"]")
	WebElement check;
	@FindBy (xpath = "//*[@id=\"iconset_37\"]/ul/li/a/span")
	WebElement check_2; 
	
	
	public void Search_bar (String name)
	{
		check.sendKeys(name);
		check.submit();
	}
	public void check_item ()
	{
		if (check_2.getText().contains("Wikipedia"));
		{
			check_2.click();
		}
		
		
		// example for future 
		// assertFalse(results.getText().contains(searchResult + " may refer to:"));
		 //assertTrue(results.getText().startsWith(searchResult));
	}
	

}
