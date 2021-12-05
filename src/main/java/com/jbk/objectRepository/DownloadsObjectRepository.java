package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadsObjectRepository {
	@FindBy(tagName = "h1")
	public WebElement header;

	@FindBy(xpath = "//tbody/tr/th")
	public List<WebElement> tableHeaders;

}
