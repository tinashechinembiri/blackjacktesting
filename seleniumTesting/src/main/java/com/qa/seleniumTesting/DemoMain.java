package com.qa.seleniumTesting;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoMain {
	
	

		@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
		WebElement create_id ; 
		@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
		WebElement password_id; 
		@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
		WebElement submit; 
		@FindBy (xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
		WebElement next; 
		
		
		public void input (String user_name)throws InterruptedException
		{
			//this.create_id = user_name; 
			//this.password_id = password; 
			create_id.sendKeys(user_name);
			
			
		}
		public void input_2 (String password)throws InterruptedException
		{
			password_id.sendKeys(password);
			submit.submit();
			next.click();
		}
		
		
		
	

}
