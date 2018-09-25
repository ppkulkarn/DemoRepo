package com.freecrm.qa.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	//Page factory or OR
	
	@FindBy(name="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	
	//intitializing object
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateCrmImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String Uname,String Upwd)
	{
		Username.sendKeys(Uname);
		Password.sendKeys(Upwd);
		loginButton.click();
		
		return new HomePage(); 
		
	}
  
}
