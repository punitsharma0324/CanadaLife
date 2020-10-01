package com.guru99.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.testCases.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver ldriver;
	
	public void LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement loginbtn;


	public void setUserName(String uname) {
		txtUsername.sendKeys(username);
	}
	
	public void setPassword(String Pwd) {
		txtPassword.sendKeys(password);
	}

	public void clickLogin () {
		loginbtn.click();
		
	}
}
