package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import commons.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	WebElement username;

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement Click;
	
	@FindBy(xpath = "//button[contains(.,'✕')]")
	WebElement crossButton;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void getUsername(String username1) {
		wait.forElementToBeVisible(username);
		sendKeys(username, username1);
	}

	public void getPassword(String password1) {
		wait.forElementToBeVisible(password);
		sendKeys(password, password1);
	}

	public void onClick() {
		wait.forElementToBeVisible(Click);
		click(Click);

	}
	
	public void skipLogin()  {
		wait.forElementToBeVisible(crossButton);
		click(crossButton);
	
	}
}
