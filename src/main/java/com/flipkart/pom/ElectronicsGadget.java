package com.flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.BaseMethod;

public class ElectronicsGadget extends BaseMethod {
	public WebDriver driver;
	@FindBy(xpath = "//span[.='Electronics']")
	private WebElement electronicsTooltip;

	@FindBy(xpath = "//a[normalize-space()='Realme']")
	private WebElement realmeMobile;

	public ElectronicsGadget(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void electronicsSection() {
		movetoelement(driver, electronicsTooltip);
		//realmeMobile.click();

	}
	public void realmeMobileSection() {
		realmeMobile.click();

	}
}
