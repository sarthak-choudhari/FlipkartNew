package Pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class ProductPage extends BasePage {

	@FindBy(xpath = "//*[@id='swatch-2-size']/a")
	WebElement size;

	@FindBy(xpath = "//*[text()='ADD TO CART']/..")
	WebElement addToCart;

	@FindBy(xpath = "//a[contains(text(),'Court Royale AC Sneakers For Men')]")
	WebElement desiredProduct;

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	public void switchToNewWindow() {
		Set<String> handles = driver.getWindowHandles();
		// System.out.println(handles);
		for (String i : handles) {
			// System.out.println(i);
			driver.switchTo().window(i);
			// System.out.println(i);
		}
		clickOnAddToCart();
	}

	public void selectSize() {
		// scrollToElementView(size);
		click(size);
	}

	public void clickOnAddToCart() {
		wait.forElementToBeClickable(addToCart);
		scrollToPixel(150);
		click(addToCart);
		System.out.println("clicking on add to cart");
	}

	/*
	 * public void clickOnAddToCart() {
	 * 
	 * Set<String> allwindows = driver.getWindowHandles(); ArrayList<String> al =
	 * new ArrayList<String>(); al.addAll(allwindows);
	 * driver.switchTo().window(al.get(1)); wait.forElementToBeClickable(addToCart);
	 * click(addToCart); }
	 */

}