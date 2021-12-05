package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.jbk.pages.DashboardPage;

public class DashboardTest extends TestBase{
	public WebDriver driver;
	DashboardPage dsp;

	@BeforeClass
	public void setup() {
		driver=intitialization();
		dsp=loadpage().navigateToDashboard(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyCourses() {
		Assert.assertTrue(dsp.checkCourses());
	}

	@Test
	public void verifySubCourses() {
		Assert.assertTrue(dsp.verifySubCourses());
	}

	@Test
	public void verifyFooter() {
		Assert.assertTrue(dsp.checkFooter());
	}

	@Test
	public void verifyDownloadsLink() {
		Assert.assertTrue(dsp.checkDownloadsLink());
	}

	@Test
	public void verifyUsersLink() {
		Assert.assertTrue(dsp.checkUsefulLink());
	}

	@Test
	public void verifyOperatorsLink() {
		Assert.assertTrue(dsp.checkOperatorsLink());
	}

	@Test
	public void verifyUsefulLink() {
		Assert.assertTrue(dsp.checkUsefulLink());
	}

}
