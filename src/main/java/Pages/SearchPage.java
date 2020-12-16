package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class SearchPage extends BasePage {

	@FindBy(xpath = "//input[@class='_3704LK']")
	WebElement searchField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement searchButton;

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	public void searchForProducts(String product) {

		try {
			wait.forElementToBeVisible(searchField);
			sendKeys(searchField, product);
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			wait.forElementToBeVisible(searchField);
			sendKeys(searchField, product);
		}

	}

	public void onClick() {
		wait.forElementToBeVisible(searchButton);
		click(searchButton);
	}
}