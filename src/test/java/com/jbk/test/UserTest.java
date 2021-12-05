package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.jbk.pages.UserPage;

public class UserTest extends TestBase {
	WebDriver driver;
	UserPage up;
	@BeforeMethod
	public void setup() {
		driver=intitialization();
		up=loadpage().navigateToDashboard(driver).navigateToUserPage(driver);
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
	
@Test
public void verifyUserForm() throws Exception {
	Assert.assertTrue(up.userForm());
}
@Test
public void checkContext() {
Assert.assertTrue(up.checkText());
}
@Test
public void deletUser1() throws Exception {
	Assert.assertTrue(up.deletUser1());

}
@Test
public void deletUser2() throws Exception {
	Assert.assertTrue(up.deletUser2());

}
}