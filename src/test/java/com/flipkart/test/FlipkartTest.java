package com.flipkart.test;

import org.testng.annotations.Test;

import com.flipkart.generics.BaseOpenBrowser;
import com.flipkart.pom.ElectronicsGadget;
import com.flipkart.pom.FlipkartCart;
import com.flipkart.pom.FlipkartHomePage;
import com.flipkart.pom.RealmeMobile;

public class FlipkartTest extends BaseOpenBrowser {
	@Test
	public void test() throws InterruptedException {

		FlipkartHomePage fh = new FlipkartHomePage(driver);
		fh.homePage();

		ElectronicsGadget aa = new ElectronicsGadget(driver);
		aa.electronicsSection();
		aa.realmeMobileSection();

		RealmeMobile rm = new RealmeMobile(driver);
		rm.chooseMobile();
		rm.addToCart();
		
		FlipkartCart fc=new FlipkartCart(driver);
		fc.placeOrder();
	}
}
