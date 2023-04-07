package comamazontestscenario;

import org.testng.annotations.Test;

import com.amazon.pages.Loginpage;
import com.amazon.base.TestBase;
import com.amazon.pages.Loginpage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class placeorder extends TestBase {
	@Test
	public void loginTest() {
		Loginpage loginPage = new Loginpage();
		loginPage.validateLogin("Aswani.nukanaboina@gmail.com","aswani@123");
		Assert.assertTrue(false);

	}

	@Test

	public void searchproductTest() {
	}

	@Test

	public void selectProductTest() {

	}

	@Test

	public void makePaymentTest() {
		launchBrowser();
	}

	// private void launchBrowser() {
	// TODO Auto-generated method stub
	// launchBrowser();
	// navigateToURL();
	// }
	@BeforeClass
	public void beforeClass() {

		launchBrowser();
		navigateToURL();
	}

	@AfterClass
	public void afterClass() {
	}

}
