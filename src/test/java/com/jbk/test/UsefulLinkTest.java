package com.jbk.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.jbk.pages.UsefulLinkPage;

public class UsefulLinkTest extends TestBase {
	UsefulLinkPage usp;
	@BeforeMethod
	public void setup() {
		driver=intitialization();
		usp=loadpage().navigateToDashboard(driver).navigateToUsefulLinkPage(driver);
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	@Test
	public void verifyHeader() {
		
		Assert.assertTrue(usp.pageHeader());
		}

}
