package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

	@FindBy(xpath = "//div[@id=\"navbarExample\"]/ul/li[1]/a")
	WebElement btnHome;

	@FindBy(xpath = "//div[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
	WebElement btnProduct1;

	@FindBy(xpath = "//div[@id=\"tbodyid\"]/div[2]/div/div/h4/a")
	WebElement btnProduct2;

	@FindBy(xpath = "//div[@id=\"tbodyid\"]/div[3]/div/div/h4/a")
	WebElement btnProduct3;

	@FindBy(xpath = "//div[@id=\"tbodyid\"]/div[9]/div/div/h4/a")
	WebElement btnProduct4;

	@FindBy(xpath = "//div[@id=\"tbodyid\"]/div[2]/div/a")
	WebElement btnAddCart;

	@FindBy(id = "cartur")
	WebElement btnCart;

	@FindBy(xpath = "//tbody[@id=\"tbodyid\"]/tr[1]/td[4]/a")
	WebElement deleteProduct1;

	@FindBy(xpath = "//tbody[@id=\"tbodyid\"]/tr[2]/td[4]/a")
	WebElement deleteProduct2;

	@FindBy(xpath = "//div[@id=\"page-wrapper\"]/div/div[2]/button")
	WebElement btnPlaceOrder;

	@FindBy(id = "name")
	WebElement inputName;

	@FindBy(id = "country")
	WebElement inputCountry;

	@FindBy(id = "city")
	WebElement inputCity;

	@FindBy(id = "card")
	WebElement inputCard;

	@FindBy(id = "month")
	WebElement inputMonth;

	@FindBy(id = "year")
	WebElement inputYear;

	@FindBy(xpath = "//div[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	WebElement btnPurchase;

	public CartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public DetailsCart addCarrito() throws InterruptedException {
		MaddCarrito();
		return new DetailsCart(driver);

	}

	public DetailsCart removeProductCart() throws InterruptedException {
		MaddCarrito();
		clickOnElement(btnCart);
		clickOnElement(deleteProduct1);
		clickOnElement(deleteProduct2);
		return new DetailsCart(driver);
	}

	public DetailsCart registerOrden(String name, String country, String city, String card, String month, String year)
			throws InterruptedException {
		this.MaddCarrito();
		clickOnElement(btnCart);
		clickOnElement(btnPlaceOrder);
		typeOnElement(inputName, name);
		typeOnElement(inputCountry, country);
		typeOnElement(inputCity, city);
		typeOnElement(inputCard, card);
		typeOnElement(inputMonth, month);
		typeOnElement(inputYear, year);
		clickOnElement(btnPurchase);
		return new DetailsCart(driver);
	}

	private void MaddCarrito() throws InterruptedException {
		clickOnElement(btnProduct1);
		clickOnElement(btnAddCart);
		acceptAlert();
		clickOnElement(btnHome);

		clickOnElement(btnProduct2);
		clickOnElement(btnAddCart);
		acceptAlert();
		clickOnElement(btnHome);

		clickOnElement(btnProduct3);
		clickOnElement(btnAddCart);
		acceptAlert();
		clickOnElement(btnHome);

		clickOnElement(btnProduct4);
		clickOnElement(btnAddCart);
		acceptAlert();
		clickOnElement(btnCart);

	}
}
