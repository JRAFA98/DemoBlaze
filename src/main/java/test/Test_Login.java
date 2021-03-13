package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class Test_Login extends BaseTest {

	@Test
	public void credencialesValidas() throws InterruptedException {
		String user = "qwerty5666";
		String pwd = "qwerty5666";

		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.doLogin(user, pwd);

		Assert.assertTrue(homePage.isDisplayed());
		Assert.assertEquals(homePage.getUser(), "Welcome qwerty5666");
	}

	@Test
	public void credencialesInvalidas() throws InterruptedException {
		String user = "qwerty5666111";
		String pwd = "qwerty5666";

		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.doLogin(user, pwd);

		Assert.assertTrue(homePage.isDisplayed());
		Assert.assertEquals(homePage.getUser(), "");
	}
}
