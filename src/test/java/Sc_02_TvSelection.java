
import Pages.*;
import commons.InitializePropertyFile;
import commons.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import static commons.Configuration.url;

public class Sc_02_TvSelection extends TestBase {

	@BeforeMethod
	public void openPage() {
		driver.get(url.asString());
	}

	@Test(priority = 1)
	public void TvPurchasing() throws IOException, InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.getUsername(InitializePropertyFile.property.getProperty("username"));
		login.getPassword(InitializePropertyFile.property.getProperty("password"));
		login.onClick();

		SearchPage search = new SearchPage(driver);
		search.searchForProducts(InitializePropertyFile.property.getProperty("product_02"));
		search.onClick();

		BrandSelection brand = new BrandSelection(driver);
		brand.filters_02();

		ProductPage product = new ProductPage(driver);
		product.switchToNewWindow();
	}
}