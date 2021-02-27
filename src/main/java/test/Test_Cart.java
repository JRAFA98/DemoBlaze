package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.CartPage;

public class Test_Cart {
	@Test 
	public void testAddCard() throws InterruptedException {
		String url = "https://www.demoblaze.com/index.html";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		CartPage cartPage = new CartPage(driver); 
		cartPage.addCarrito();
	}
}
