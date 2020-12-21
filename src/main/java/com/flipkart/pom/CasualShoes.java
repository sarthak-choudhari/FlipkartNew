package com.flipkart.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.BaseMethod;

public class CasualShoes extends BaseMethod {
	public WebDriver driver;
	@FindBy(xpath = "//div[@title='Puma']//div[text()='Puma']")
	private WebElement filterPuma;
	@FindBy(xpath = "//div[contains(text(),'4★ & above')]")
	private WebElement filterRating;
	@FindBy(xpath = "//div[@data-id='SHOFBPZ6Y844KRFM']//a[2]")
	private WebElement desireProduct;
	@FindBy(xpath = "//section/descendant::span[text()='15 MORE']")
	private WebElement moreColour;
	@FindBy(xpath = "//div[@title='White']//div/label")
	private WebElement whiteColourCheckbox;

	public CasualShoes(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void filter() throws InterruptedException{
		filterPuma.click();
		try {
			elementToBeClickable(driver, filterRating);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			elementToBeClickable(driver, filterRating);
		}
		scroll(driver);
		elementToBeClickable(driver, moreColour);
		clickJavaSriptExecutor(driver, whiteColourCheckbox);
	}

	public void selectShoes(){
		waitToBeClickable(driver, desireProduct);
		/*
		 * try{ desireProduct.click(); }
		 * catch(org.openqa.selenium.StaleElementReferenceException ex){
		 * desireProduct.click(); }
		 */
		clickJavaSriptExecutor(driver, desireProduct);

	}
}
