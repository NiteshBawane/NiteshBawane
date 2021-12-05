package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsefulLinkObjectRepository {

	@FindBy(tagName = "h1")
	 protected WebElement header;

	@FindBy(xpath = "//tbody/tr/td[2]")
	  protected List<WebElement> content;

	@FindBy(xpath = "//span[text()='Go !']")
	 protected List<WebElement> contentlinks;


}
