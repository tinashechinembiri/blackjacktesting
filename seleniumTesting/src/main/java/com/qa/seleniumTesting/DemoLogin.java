package com.qa.seleniumTesting;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoLogin {
	
@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
WebElement username_id; 
@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
WebElement password_id; 
@FindBy (xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input")
WebElement submit; 
@FindBy (xpath= "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
WebElement check; 

public void login_username (String user_name)
{
	username_id.sendKeys(user_name);
	
}
public void login_password (String password)
{
	password_id.sendKeys(password);
	submit.submit();
	
	
}
public String get_username()
{
	return check.getText(); 
}
public WebElement get_password()
{
	return password_id; 
}
}
