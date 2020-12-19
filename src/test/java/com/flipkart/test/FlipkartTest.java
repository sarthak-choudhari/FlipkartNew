package com.flipkart.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.flipkart.generics.BaseOpenBrowser;
import com.flipkart.pom.CasualShoes;
import com.flipkart.pom.ElectronicsGadget;
import com.flipkart.pom.FlightsBooking;
import com.flipkart.pom.FlipkartCart;
import com.flipkart.pom.FlipkartHomePage;
import com.flipkart.pom.PumaShoes;
import com.flipkart.pom.RealmeMobile;
import com.flipkart.pom.SelectFlight;

@Listeners(com.flipkart.generics.Listeners.class)
public class FlipkartTest extends BaseOpenBrowser {
	@Test(priority = 1)
	public void realmeMobile() {

		FlipkartHomePage fh = new FlipkartHomePage(driver);
		fh.loginPage();

		ElectronicsGadget aa = new ElectronicsGadget(driver);
		//aa.electronicsSection();
		aa.realmeMobileSection();
		

		RealmeMobile rm = new RealmeMobile(driver);
		rm.chooseMobile();
		rm.addToCart();

		FlipkartCart fc = new FlipkartCart(driver);
		fc.placeOrder();
	}

	@Test(priority = 2)
	public void flightBooking() {

		FlipkartHomePage fh = new FlipkartHomePage(driver);
		fh.loginPage();
		fh.flight();

		FlightsBooking fb = new FlightsBooking(driver);
		fb.fromField();
		fb.toField();
		fb.selectDate();
		fb.selectClass();
		fb.searchFlight();

		SelectFlight se = new SelectFlight(driver);
		//se.filter();
		se.bookFlight();
	}

	@Test(priority = 3)
	public void pumaShoes() {
		FlipkartHomePage fh = new FlipkartHomePage(driver);
		fh.loginPage();
		fh.searchFiled();

		CasualShoes cs = new CasualShoes(driver);
		cs.filter();
		//cs.selectShoes();

		PumaShoes ps = new PumaShoes(driver);
		ps.windowSwitch();
		ps.selectSize();
		ps.addToCart();

	}
}
