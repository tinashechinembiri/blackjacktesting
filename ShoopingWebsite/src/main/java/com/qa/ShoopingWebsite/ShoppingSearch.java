package com.qa.ShoopingWebsite;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingSearch {
	String text;
	@FindBy (xpath= "//*[@id=\"search_query_top\"]")
	WebElement searchbox; 
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	WebElement button_search; 
	
	public void search (String text)
	{
		this.text = text; 
		searchbox.sendKeys(text);
		button_search.submit();
		
		
	}
	public String text_1 ()
	{
		return text;
	}

}
