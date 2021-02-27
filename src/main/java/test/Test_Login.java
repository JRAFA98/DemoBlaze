package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Test_Login {
	@Test 
	public void testLogin() throws InterruptedException {
		String url = "https://www.demoblaze.com/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		String user = "qwerty5666";
		String pwd = "qwerty5666";
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(user, pwd);
	}
}
