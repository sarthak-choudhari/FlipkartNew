package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class BrandSelection extends BasePage {
	
	@FindBy(xpath = "//div[contains(text(),'Nike')]")
	WebElement selectBrandName_01;
	
	@FindBy(xpath = "//div[@class='_3879cV' and contains(text(),'LG')]")
	WebElement selectBrandName_02;
	
	@FindBy(xpath = "//div[contains(text(),'Black')]")
	WebElement color;
	
	@FindBy(xpath = "//a[contains(text(),'Court Royale AC Sneakers For Men')]")
	WebElement desiredProduct;
	
	@FindBy(xpath = "//div[contains(text(),'LG 108cm (43 inch) Full HD LED Smart TV 2020 Edition')]")
	WebElement desiredProduct_02;
	
	@FindBy(xpath = "//div//a[@class='_2SqgSY' and contains(text(),'Men')]")
	WebElement MensFootwearCategories;
	
	@FindBy(xpath = "//div[@class='_3879cV' and text()='8']")
	WebElement size;
	
	@FindBy(xpath = "//div[contains(text(),'4★ & above')]")
	WebElement customerRating;
	
	@FindBy(xpath = "//div[@class='_3879cV' and contains(text(),'Yes')]")
	WebElement smartTV;
	
	public BrandSelection(WebDriver driver) {
		super(driver);
	}

	public void selectTheBrand_01() {
		wait.forElementToBeVisible(selectBrandName_01);
		click(selectBrandName_01);
	}
	
	public void selectTheBrand_02() {
		wait.forElementToBeVisible(selectBrandName_02);
		click(selectBrandName_02);
	}
	
	public void selectColor() {
		wait.forElementToBeVisible(color);
		click(color);
	}
	
	
	public void requiredProduct_01() {
		wait.forElementToBeVisible(desiredProduct);
		click(desiredProduct);
	}
	
	public void requiredProduct_02() {
		wait.forElementToBeVisible(desiredProduct_02);
		click(desiredProduct_02);
	}
	
	public void selectTheCategories()
	{
		wait.forElementToBeVisible(MensFootwearCategories);
		click(MensFootwearCategories);
	}
	
	public void selectSize_01()
	{
		wait.forElementToBeVisible(size);
		click(size);
	}
	
	public void selectSmartTv()
	{
		wait.forElementToBeVisible(smartTV);
		click(smartTV);
	}
	
	public void selectCustomerRating_02()
	{
		wait.forElementToBeVisible(customerRating);
		click(customerRating);
	}
	
	public void filters_01()
	{
		selectTheCategories();
		selectTheBrand_01();
		selectSize_01();
		requiredProduct_01();
	}
	

	public void filters_02()
	{
		selectTheBrand_02();
		selectCustomerRating_02();
		selectSmartTv();
		requiredProduct_02();
	}
}