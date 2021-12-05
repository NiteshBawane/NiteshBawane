package com.jbk.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.objectRepository.UserPageObjectRepository;

public class UserPage extends UserPageObjectRepository {
	
	WebDriver driver;
	public UserPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean userForm() throws Exception {
		usersLink.click();
		userBtn.click();
		uName.sendKeys("Nitesh");
		uMobile.sendKeys("88888888888");
		uEmail.sendKeys("kiran@gmail.com");
		uCourse.sendKeys("Selenium");
		uGender.click();
		uState.click();
		uPassword.sendKeys("123456");
		submitBtn.click();
		Alert alert = driver.switchTo().alert();
		String actalertMsg = alert.getText();
		String expalertMag = "User Added Successfully. You can not see added user.";
		Thread.sleep(2000);
		alert.accept();
		if (actalertMsg.equals(expalertMag)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean deletUser1() throws Exception {
		usersLink.click();
		deletUser1.click();
		Alert alert = driver.switchTo().alert();
		String actalertMsg = alert.getText();
		String expalertMag = "You can not delete Default User";
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(actalertMsg, expalertMag);
		if (actalertMsg.equals(expalertMag)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deletUser2() throws Exception {
		usersLink.click();
		deletUser2.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String actalertMsg = alert.getText();
		String expalertMag = "User deleted successfully.";
		Thread.sleep(2000);
		alert.accept();
		Assert.assertEquals(actalertMsg, expalertMag);
		if (actalertMsg.equals(expalertMag)) {
			return true;
		} else {
			return false;
		}

	}
	public boolean checkText() {
	String act=text.getText();
	String exp="Users";
	if (act.equals(exp)) {
		return true;
	} else {
		return false;
	}
	}
}
