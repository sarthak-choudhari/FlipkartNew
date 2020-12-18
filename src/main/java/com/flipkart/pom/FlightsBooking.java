package com.flipkart.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.BaseMethod;

public class FlightsBooking extends BaseMethod {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='0-departcity']")
	private WebElement searchField;
	@FindBy(xpath = "//div[@class='_24hoQ2 _1EzOls']/div/div[.='NYC']")
	private WebElement fromTextField;
	@FindBy(xpath = "//input[@name='0-arrivalcity']")
	private WebElement toTextField;
	@FindBy(xpath = "//div[.='DEL']")
	private WebElement destination;
	@FindBy(xpath = "(//table[contains(.,'December 2020')]//tr/td)[32]")
	private WebElement datepick;
	@FindBy(xpath="//div[text()='Business']")
	private WebElement cabinclass;
	@FindBy (xpath = "//button[.='Done']")
	private WebElement donebutton;
	@FindBy(xpath = "//button[@type='button']")
	private WebElement searchbutton;

	public FlightsBooking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void fromField(){
		
		waitExplicit(driver, searchField);
		searchField.clear();
		searchField.sendKeys("new yourk");
		fromTextField.click();
		

	}
	public void toField() {
		toTextField.sendKeys("del");
		 destination.click();
	}
	public void selectDate() {
		 datepick.click();
	}
	
	public void selectClass() {
		cabinclass.click();
	     donebutton.click();
	}
	public void searchFlight(){
		searchbutton.click();
	}
}
