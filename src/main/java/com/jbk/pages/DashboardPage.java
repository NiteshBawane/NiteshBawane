package com.jbk.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.DashboardPageObjectRepository;

public class DashboardPage extends DashboardPageObjectRepository {
	public WebDriver driver;
	LoginPage lp=null;
	DashboardPage dp=null;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public  UserPage  navigateToUserPage(WebDriver driver){
		userLink.click();
		return new UserPage(driver);
		
	}public  DownloadsPage navigateToDownloadsPage(WebDriver driver){
		downloadsLink.click();
		return new DownloadsPage(driver);
		
	}public  UsefulLinkPage navigateToUsefulLinkPage(WebDriver driver){
		usefulLink.click();
		return new UsefulLinkPage(driver);
		
	}public  OperatorPage navigateToOperatorPage(WebDriver driver){
		operatorsLink.click();
		return new OperatorPage(driver);
	
	}
	public boolean checkCourses() {
		//List<WebElement> Courses = courses;
		ArrayList<String> actCourses = new ArrayList<String>();
		for (WebElement course : courses) {
			String text = course.getText();
			actCourses.add(text);
		}
		ArrayList<String> expCourses = new ArrayList<String>();
		expCourses.add("Selenium");
		expCourses.add("Java / J2EE");
		expCourses.add("Python");
		expCourses.add("Php");
		if (actCourses.equals(expCourses)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean verifySubCourses() {
	//	List<WebElement> subcourses = subCourses;
		ArrayList<String> actsubCourses = new ArrayList<String>();
		for (WebElement course : subCourses) {
			String text = course.getText();
			actsubCourses.add(text);
		}
		ArrayList<String> expsubCourses = new ArrayList<String>();
		expsubCourses.add("Automation Testing");
		expsubCourses.add("Software Development");
		expsubCourses.add("Data Science");
		expsubCourses.add("Web Development");

		if (actsubCourses.equals(expsubCourses)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkFooter() {
		String act = footer.getText();
		String exp = "Design for Selenium Automation Test V 2.3.0\nCopyright © 2005-2019 JavaByKiran. All rights reserved.";
		if (act.equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkDownloadsLink() {
		downloadsLink.click();
		String act=driver.getTitle();
		String exp="JavaByKiran | Downloads";
		if (act.equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkUsersLink() {
		userLink.click();
		String act=driver.getTitle();
		String exp="JavaByKiran | User";
		if (act.equals(exp)) {
			return true;
		} else {
			return false;
		}
		}

	public boolean checkOperatorsLink() {
		operatorsLink.click();
		String act=driver.getTitle();
		String exp="JavaByKiran | Operators";
		if (act.equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean checkUsefulLink() {
		usefulLink.click();
		String act=driver.getTitle();
		String exp="JavaByKiran | Useful Links";
		if (act.equals(exp)) {
			return true;
		} else {
			return false;
		}
	}

}
/*
 * public void checkinfoLink() throws Exception { String mainwin =
 * driver.getWindowHandle(); WebElement info = information; List<WebElement>
 * moreinfo = information.m; for (WebElement webElement : moreinfo) {
 * Thread.sleep(2000); webElement.click(); } Set<String> windows =
 * driver.getWindowHandles(); for (String win : windows) { if
 * (!win.equals(mainwin)) { driver.switchTo().window(win);
 * System.out.println(driver.getCurrentUrl()); Thread.sleep(1000);
 * driver.close(); } } int act = moreinfo.size(); int exp = 4;
 * Assert.assertEquals(act, exp); }
 */
