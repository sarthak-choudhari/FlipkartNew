package com.flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage {
	public WebDriver driver;
	@FindBy(xpath = "//button[contains(.,'✕')]")
	private WebElement crossButton;

	public FlipkartHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void homePage() throws InterruptedException {
		crossButton.click();
		Thread.sleep(3000);
	}
}
