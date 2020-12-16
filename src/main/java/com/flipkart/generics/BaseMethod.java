package com.flipkart.generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseMethod {
	public void selectvisibeltext(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void selectvisibelvalue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	public void selectvisibleindex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void movetoelement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();

	}

	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
		act.release();
	}

	public void dragAnddrop(WebDriver driver, WebElement elementsource, WebElement elementtarget) {
		Actions act = new Actions(driver);
		act.dragAndDrop(elementsource, elementtarget).perform();

	}

	public void dragAnddropBy(WebDriver driver, WebElement element, int x, int y) {
		Actions act = new Actions(driver);
		act.dragAndDropBy(element, x, y).perform();
	}

	public void robottab() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public void alertAccept(WebDriver driver) {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
}
