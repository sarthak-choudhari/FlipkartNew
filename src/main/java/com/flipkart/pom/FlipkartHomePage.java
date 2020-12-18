package com.flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.BaseMethod;

public class FlipkartHomePage extends BaseMethod {
	public WebDriver driver;
	@FindBy(xpath = "//button[contains(.,'✕')]")
	private WebElement crossButton;
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement search;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	@FindBy(xpath = "//a[.='Flights']")
	private WebElement flightmenu;

	public FlipkartHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginPage() {
		crossButton.click();
	}
	
    public void flight() {
    	waitExplicit(driver,flightmenu);
    	flightmenu.click();
    }
    
	public void searchFiled() {
		waitExplicit(driver, search);
		search.sendKeys("casual shoes");
		submitButton.click();
	}
}
