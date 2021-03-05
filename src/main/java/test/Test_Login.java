package test;

import org.testng.annotations.Test;

import pages.LoginPage;

public class Test_Login extends BaseTest {
	

	@Test
	public void credencialesValidas() throws InterruptedException {
		String user = "qwerty5666";
		String pwd = "qwerty5666";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(user, pwd);
	}
	
	@Test
	public void credencialesInvalidas() throws InterruptedException {
		String user = "qwerty5666111";
		String pwd = "qwerty5666";
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(user, pwd);
	}
}
