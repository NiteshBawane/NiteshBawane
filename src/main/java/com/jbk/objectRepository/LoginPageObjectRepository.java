package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectRepository {
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "password")
	public WebElement pass;
	
	@FindBy(xpath = "//button")
	public WebElement signUp;
	
	@FindBy(tagName = "b")
	public WebElement text1;
	
	@FindBy(tagName = "img")
	public WebElement logo;
	
	@FindBy(tagName = "h4")
	public WebElement text2;
	
	@FindBy(id = "email_error")
	public WebElement emailErrorMsg;
	
	@FindBy(id = "password_error")
	public WebElement passErrorMsg;
	
	@FindBy(partialLinkText = "Register")
	public WebElement registerLink;
	
}
