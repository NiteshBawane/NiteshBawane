package com.jbk.objectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperatorPageObjectRepository {
@FindBy(xpath="//th")
public List<WebElement> heading;

@FindBy(xpath="//tr//td[2]")
public List<WebElement> persons;

@FindBy(xpath="//tr//td[6]")
public List<WebElement> timings;

@FindBy(xpath="//tr//td[5]")
public List<WebElement> contacts;
}
