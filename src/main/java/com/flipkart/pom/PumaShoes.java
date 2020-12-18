package com.flipkart.pom;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.BaseMethod;

public class PumaShoes extends BaseMethod {
	public WebDriver driver;
	@FindBy(xpath = "//div[@class='_22QfJJ']//a[text()='10']")
	private WebElement size;
	@FindBy(xpath = "//button[.=' ADD TO CART']")
	private WebElement cartButton;

	public PumaShoes(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void windowSwitch() {
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(allwindows);
		driver.switchTo().window(al.get(1));
	}

	public void selectSize() {
		elementToBeClickable(driver, size);
	}

	public void addToCart() {
		elementToBeClickable(driver, cartButton);
	}
}
