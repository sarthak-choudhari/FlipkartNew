package com.flipkart.pom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generics.BaseMethod;

public class RealmeMobile extends BaseMethod {
	public WebDriver driver;
	@FindBy(xpath = "//div[contains(text(),'Realme Narzo 20')]")
	private List<WebElement> Narzo20;

	@FindBy(xpath = "//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")
	private WebElement cartButton;

	public RealmeMobile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void chooseMobile() {
		for (int i = 0; i < Narzo20.size(); i++) {
			if (Narzo20.get(i).getText().equalsIgnoreCase("Realme Narzo 20 (Victory Blue, 128 GB)")) {
				Narzo20.get(i).click();
				break;
			}
		}
	}

	public void addToCart() {

		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(allwindows);
		driver.switchTo().window(al.get(1));
		cartButton.click();

	}
}
