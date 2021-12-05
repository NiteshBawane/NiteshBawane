package com.jbk.pages;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.objectRepository.OperatorPageObjectRepository;
import com.utility.ExcelUtility;


public class OperatorPage extends OperatorPageObjectRepository {
	WebDriver driver = null;
	FileInputStream fis;
		String filePath="C:\\Users\\91814\\Desktop\\operatorPage.xls";
	public OperatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean checkOperatorHeading() throws Exception {
		List<WebElement> list = heading;
		ArrayList<String> actlist = new ArrayList<String>();
		for (WebElement string : list) {
			String wl = string.getText();
			actlist.add(wl);
		}
		ArrayList<String> explist = ExcelUtility.readDataRowdata(filePath, 0, 1, 0);
		System.out.println(actlist);
		System.out.println(explist);
		if (actlist.equals(explist)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean checkOperatorPesons() throws Exception {
		List<WebElement> list = persons;
		ArrayList<String> actlist = new ArrayList<String>();
		for (WebElement string : list) {
			String wl = string.getText();
			actlist.add(wl);
		}
		ArrayList<String> explist=ExcelUtility.readDataColdata(filePath, 0, 1, 2);
		System.out.println(actlist);
		System.out.println(explist);
		if (actlist.equals(explist)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean checkOperatorTimings() throws Exception {
		List<WebElement> list = timings;
		ArrayList<String> actlist = new ArrayList<String>();
		for (WebElement string : list) {
			String wl = string.getText();
			actlist.add(wl);
		}
		ArrayList<String> explist=ExcelUtility.readDataColdata(filePath, 0, 5, 2);
		System.out.println(actlist.size());
		System.out.println(explist);
		System.out.println(actlist);
		if (actlist.equals(explist)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean checkOperatorContacts() throws Exception {
		List<WebElement> list = contacts;
		ArrayList<String> actlist = new ArrayList<String>();
		for (WebElement string : list) {
			String wl = string.getText();
			actlist.add(wl);
		}
		ArrayList<String> explist=(ArrayList<String>) ExcelUtility.readDataColdata(filePath, 0, 4, 2);
		
		System.out.println(actlist);
		System.out.println(explist);
		if (actlist.equals(explist)) {
			return true;
		} else {
			return false;
		}
	}
}
