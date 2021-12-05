package com.jbk.test;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.jbk.pages.OperatorPage;


public class OperatorTest extends TestBase {
	WebDriver driver = null;
	OperatorPage op;

	@BeforeMethod
	public void setup() {
		driver = intitialization();
		op = loadpage().navigateToDashboard(driver).navigateToOperatorPage(driver);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(priority = 0)
	public void checkOperatorPessons() throws Exception {

		Assert.assertTrue(op.checkOperatorPesons());
		
	}

	@Test(priority = 1)
	public void checkHeading() throws Exception {
		Assert.assertTrue(op.checkOperatorHeading());
	}

	@Test(priority = 2)
	public void checkTiming() throws Exception {
		Assert.assertTrue(op.checkOperatorTimings());
	}

	@Test(priority = 3)
	public void checkOperatorContactNo() throws Exception {
		Assert.assertTrue(op.checkOperatorContacts());

	}
}
