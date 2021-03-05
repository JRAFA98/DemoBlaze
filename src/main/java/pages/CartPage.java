package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
	
	//Agregar_al_carrito
	@FindBy (xpath="//*[@id=\"navbarExample\"]/ul/li[1]/a")
	WebElement btnHome;

	@FindBy (xpath="//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
	WebElement btnProduct1;
	
	@FindBy (xpath="//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")
	WebElement btnProduct2;
	
	@FindBy (xpath="//*[@id=\"tbodyid\"]/div[3]/div/div/h4/a")
	WebElement btnProduct3;
	
	@FindBy (xpath="//*[@id=\"tbodyid\"]/div[9]/div/div/h4/a")
	WebElement btnProduct4;
	
	@FindBy (xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
	WebElement btnAddCart;
	
	//Eliminar_producto_del_carrito
	@FindBy (id = "cartur")
	WebElement btnCart;
	
	@FindBy (xpath = "//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")
	WebElement deleteProduct1;
	
	@FindBy (xpath = "//*[@id=\"tbodyid\"]/tr[2]/td[4]/a")
	WebElement deleteProduct2;
	
	// Formulario_Orden
	
	
	public CartPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void addCarrito(int metodo) throws InterruptedException {
		
		//Agregar_Producto_1
		clickOnElement(btnProduct1, 10);
		clickOnElement(btnAddCart, 10);
		acceptAlert(10);
		clickOnElement(btnHome, 10);
		
		//Agregar_Producto_2 
		clickOnElement(btnProduct2, 10);
		clickOnElement(btnAddCart, 10);
		acceptAlert(10);
		clickOnElement(btnHome, 10);
		
		//Agregar_Producto_3
		clickOnElement(btnProduct3, 10);
		clickOnElement(btnAddCart, 10);
		acceptAlert(10);
		clickOnElement(btnHome, 10);
		
		//Agregar_Producto_4
		clickOnElement(btnProduct4, 10);
		clickOnElement(btnAddCart, 10);
		acceptAlert(10);
		if(metodo == 1) {
			this.goProductsCart();
		}else {
			clickOnElement(btnHome, 10);	
		}
		
	}
	
	public void goProductsCart() {
		clickOnElement(btnCart, 10);
		this.removeProductCart();
	}
	
	public void removeProductCart() {
		clickOnElement(deleteProduct1, 10);
		clickOnElement(deleteProduct2, 10);
	}
	
	public void registerOrden(String datos[]) {
		
	}
}
