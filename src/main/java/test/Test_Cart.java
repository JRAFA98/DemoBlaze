package test;

import org.testng.annotations.Test;

import pages.CartPage;

public class Test_Cart extends BaseTest  {
	CartPage cartPage;
	@Test 
	public void testAddCard() throws InterruptedException {
		cartPage = new CartPage(driver); 
		cartPage.addCarrito(0);
	}
	
	
	@Test 
	public void removeProductsCard() throws InterruptedException {
		cartPage = new CartPage(driver);
		cartPage.addCarrito(1);
	}
}
