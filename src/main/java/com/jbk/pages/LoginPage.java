package com.jbk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jbk.objectRepository.LoginPageObjectRepository;

public class LoginPage extends LoginPageObjectRepository {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
public DashboardPage navigateToDashboard(WebDriver driver){
	email.sendKeys("kiran@gmail.com");
	pass.sendKeys("123456");
	signUp.click();
	return new DashboardPage (driver);
}

	public boolean inValidLogin() {
		email.sendKeys("xadisah");
		pass.sendKeys("e32312e1");
		signUp.click();
		String expmail = "Please enter email as kiran@gmail.com";
		String actmail = driver.findElement(By.id("email_error")).getText();
		if (actmail.equals(expmail)) {
			System.out.println("Please Enter Valid Data");
			return true;
		} else {
			System.out.println("Title is not Match ");
			return false;
		}

	}

	public boolean validLogin() {
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		signUp.click();
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Dashboard";
		if (actTitle.equals(expTitle)) {
			System.out.println("Title is Match");
			return true;
		} else {
			System.out.println("Title is not Match ");
			return false;
		}
	}

	public boolean checkTextOnLink1() {
		String act = text1.getText();
		String exp = "Java By Kiran";
		if (act.equals(exp)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean checkLogo() {
		boolean logo = driver.findElement(By.tagName("img")).isDisplayed();
		return logo;
	}

	public boolean checkTextOnLink2() {
		String act = driver.findElement(By.tagName("h4")).getText();
		String exp = "JAVA | SELENIUM | PYTHON";
		if (act.equals(exp)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean checkRegistrationLink() {
		registerLink.click();
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Registration Page";
		if (actTitle.equals(expTitle)) {
			return true;
		} else {
			return false;
		}
	}

}
