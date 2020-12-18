package com.flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartCart {
public WebDriver driver;

@FindBy(xpath = "//input[contains(@placeholder,'Enter delivery pincode')]")
private WebElement pincodeField;

@FindBy(xpath = "//span[contains(.,'Check')]")
private WebElement checkButton;

@FindBy (xpath = "//span[.='Place Order']")
private WebElement OrderButton;

public FlipkartCart(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void placeOrder() {
	
	try {
		pincodeField.sendKeys("247662");
		checkButton.click();
	    OrderButton.click();
	}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
	{
		pincodeField.sendKeys("247662");
		checkButton.click();
	    OrderButton.click();
	  
	}
}
}
