package com.greens.ages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.greens.utils.BaseClass;

public class LoginPage extends BaseClass {
	
	
	public  LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement user;
	
	@FindBy(id = "pass")
	private WebElement pswd;
	
	@FindBy(name = "login")
	private WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getLogin() {
		return login;
	}

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

