package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.DetailsCart;

public class Test_Cart extends BaseTest {
	CartPage cartPage;
	DetailsCart detailsCart;

	@Test
	public void testAddCard() throws InterruptedException {
		cartPage = new CartPage(driver);
		detailsCart = cartPage.addCarrito();
		Assert.assertTrue(detailsCart.isDisplayLayoutTotal());
	}

	@Test
	public void removeProductsCard() throws InterruptedException {
		cartPage = new CartPage(driver);
		detailsCart = cartPage.removeProductCart();
		Assert.assertTrue(detailsCart.isDisplayLayoutTotal());
	}

	@Test
	public void MakeOrder() throws InterruptedException {
		cartPage = new CartPage(driver);
		detailsCart = cartPage.registerOrden("Jose Rafael Rojas", "Costa Rica", "Liberia", "456787654565445", "Mayo",
				"2021");
		Assert.assertTrue(detailsCart.isDisplayLayoutOrder());
	}

}
