package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.UsefulLinkObjectRepository;

public class UsefulLinkPage extends UsefulLinkObjectRepository{
WebDriver driver;
	public UsefulLinkPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean  pageHeader() {
		 String actual=header.getText();
		 String expected = "Useful Links";
		 if (actual.equals(expected)) {
			return true;
		} else {
			return false;
		}
}
}