package com.flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
public WebDriver driver;

@FindBy(xpath = "//div[@class='non-stop']//span[@class='switch-handle']")
private WebElement filterButton;
@FindBy(xpath = "//div[text()='AI102']/../../../../..//button[text()='Book']")
private WebElement bookButton;

public SelectFlight(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void filter() {
	filterButton.click();
}
public void bookFlight() {
	bookButton.click();
}
}
