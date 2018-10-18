package com.qa.FeatureFile;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;

public  class MenuPage {
	@FindBy (xpath= "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a") 
	WebElement menu_Button;  
	@FindBy (xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	WebElement one_checkeot; 
	@FindBy (xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span")
	WebElement check_2;
	@FindBy (xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]/span")
	WebElement check_3; 
	///coints the text 
	@FindBy (xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	WebElement green_tea; 
	@FindBy (xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
	WebElement red_tea; 
	@FindBy (xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231735\"]/div/p/span/span/strong")
	WebElement Oolong_tea; 
	
	
	public void get_menu()
	{
		menu_Button.click(); 
	}
	public boolean check_menu()
	{
		//List name = new  ArrayList<String> ();  
		if (one_checkeot.isDisplayed() && check_2.isDisplayed()&& check_3.isDisplayed())
		{
			//one_checkeot.click();
			//check_2.click();
			return true; 
			
		}
		return false; 
		
	}
	public boolean lis_menu()
	{
		if (green_tea.getText().contains("Green Tea") && red_tea.getText().contains("Red Tea")&& Oolong_tea.getText().contains("Oolong Tea"))
		{
			return true; 
		}
		return false; 
	}
	public void click_page ()
	{
		if (one_checkeot.isDisplayed() && check_2.isDisplayed()&& check_3.isDisplayed())
		{
			one_checkeot.click();
		}
	}
	
	

}
