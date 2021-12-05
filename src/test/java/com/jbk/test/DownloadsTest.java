package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.jbk.pages.DownloadsPage;

public class DownloadsTest extends TestBase {
	DownloadsPage dp;
	@BeforeMethod
	public void setup() {
		driver=intitialization();
		dp=loadpage().navigateToDashboard(driver).navigateToDownloadsPage(driver);
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	@Test
	public void verifyHeader() {
		Assert.assertTrue(dp.header());;
		}

}
