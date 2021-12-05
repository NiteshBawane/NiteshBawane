package com.jbk.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPageObjectRepository {

	@FindBy(linkText="Users")
	public WebElement usersLink;
	
	@FindBy(xpath="//button")
	public WebElement userBtn;
	
	@FindBy(id="username")
	public WebElement uName;
	
	@FindBy(id="email")
	public WebElement uEmail;
	
	@FindBy(id="mobile")
	public WebElement uMobile;
	
	@FindBy(xpath="//input[@value='Male']")
	public WebElement uGender;
	
	@FindBy(id="course")
	public WebElement uCourse;
	
	@FindBy(xpath="//option[2]")
	public WebElement uState;
	
	@FindBy(id="password")
	public WebElement uPassword;
	
	@FindBy(xpath="//button")
	public WebElement submitBtn;
	
	@FindBy(linkText="Delete")
	public WebElement deletUser1;
	
	@FindBy(xpath="//*[@id=\"tr_2\"]/td[8]/a/span")
	public WebElement deletUser2;
	
	@FindBy(xpath="//h1[contains(text(),'Users')]")
	public WebElement text;
	
	@FindBy(xpath="//td[contains(text(),'@gmail')]")
	public WebElement emails;
} 
