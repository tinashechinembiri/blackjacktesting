package com.qa.parameters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchClass {
	@FindBy (xpath = "//*[@id=\"sb_form_q\"]")
	WebElement element; 
	@FindBy(xpath = "//*[@id=\"b_results\"]")
	WebElement Element_1; 
	////*[@id="b_results"]
	public String name; 
	public WebElement search ()
	{
		
		return element;
	}
	
	public String feature_search()
	{
		
		return Element_1.getAttribute("value") ; 
	}

}
