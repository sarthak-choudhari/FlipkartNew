package com.flipkart.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.BaseMethod;

public class CasualShoes extends BaseMethod {
	public WebDriver driver;
	@FindBy(xpath = "//div[@title='Puma']//div[@class='_24_Dny']")
	private WebElement filterPuma;
	@FindBy(xpath = "//div[contains(text(),'4★ & above')]")
	private WebElement filterRating;
	@FindBy(xpath = "//div//a[@title='Puma Smash v2 SL one8 Sneakers For Men']")
	private WebElement desireProduct;
	@FindBy(xpath = "//span[text()='17 MORE']")
	private WebElement moreColour;
	@FindBy(xpath = "//div[@title='White']//div[@class='_24_Dny']")
	private WebElement whiteColourCheckbox;

	public CasualShoes(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void filter() {
		filterPuma.click();
		try {
			elementToBeClickable(driver, filterRating);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			elementToBeClickable(driver, filterRating);
		}
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
