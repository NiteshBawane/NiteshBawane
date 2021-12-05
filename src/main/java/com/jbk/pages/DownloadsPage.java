package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.jbk.objectRepository.DashboardPageObjectRepository;
import com.jbk.objectRepository.DownloadsObjectRepository;

public class DownloadsPage extends DownloadsObjectRepository {
WebDriver driver;
	public DownloadsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean actuableHeader() {
		ArrayList<String> actuallist = new ArrayList<String>();
		for (WebElement webElement : tableHeaders) {
			String header = webElement.getText();
			actuallist.add(header);
		}
		String expected = "Useful Links";
		if (actuallist.equals(expected)) {
			return true;
		} else {
			return false;
		}
	}
@Test
	public boolean header() {
		String actual = header.getText();
		String expected = "Downloads";
		System.out.println(actual);
		if (actual.equals(expected)) {
			return true;
		} else {
			return false;
		}
	}
	}




