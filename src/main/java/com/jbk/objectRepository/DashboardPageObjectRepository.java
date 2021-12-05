package com.jbk.objectRepository;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObjectRepository {
@FindBy(tagName="h3")
public List<WebElement> courses;

@FindBy(xpath="//h3//following::p")
public List<WebElement> subCourses;

@FindBy(xpath="//footer")
public WebElement footer;

@FindBy(partialLinkText="Downloads")
public WebElement downloadsLink;

@FindBy(linkText="Users")
public WebElement userLink;

@FindBy(linkText="Operators")
public WebElement operatorsLink;

@FindBy(partialLinkText="Useful")
public WebElement usefulLink;

@FindBy(xpath="//section[@class='content']")
public WebElement information;

@FindBy(xpath="//a[text()='More info ']")
public WebElement moreInformation;


}
