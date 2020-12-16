package com.flipkart.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseOpenBrowser implements AutoConstant{
	public WebDriver driver;
	@BeforeSuite
	public void start() {
		Reporter.log("excecution start",true);
	}
@BeforeMethod
public void openapp() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}
}
