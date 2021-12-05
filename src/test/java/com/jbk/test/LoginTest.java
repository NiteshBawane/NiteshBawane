package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.jbk.pages.LoginPage;

public class LoginTest extends TestBase {
	public WebDriver driver = null;
	LoginPage lp = null;

	@BeforeMethod
	public void setup() {
		driver = intitialization();
		lp = new LoginPage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyTitle() {
		Assert.assertTrue(lp.validLogin());
	}

	@Test
	public void verifyText1() {
		Assert.assertTrue(lp.checkTextOnLink1());
	}

	@Test
	public void invalidEmail() {
		Assert.assertTrue(lp.inValidLogin());
	}

	@Test
	public void checkLogo() {
		Assert.assertTrue(lp.checkLogo());
	}

	@Test
	public void verifyTextOnLink2() {
		Assert.assertTrue(lp.checkTextOnLink2());
	}

	@Test
	public void verifyRegistrationLink() {
		Assert.assertTrue(lp.checkRegistrationLink());

	}
}
