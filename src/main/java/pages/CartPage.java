package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage{
	
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
	
	WebDriver driver;
	
	public CartPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void addCarrito(int cant) throws InterruptedException {
		
		for(int i = 0; i <= cant; i++) {
			
			//agregarProducto
			clickOnElementWait(10,btnProduct1);
			clickOnElementWait(10,btnAddCart);
			acceptAlert();
			clickOnElement(btnHome);			
		}
		/*
		//Agregar_Producto_1
		clickOnElementWait(10,btnProduct1);
		clickOnElementWait(10,btnAddCart);
		acceptAlert();
		clickOnElement(btnHome);
		
		//Agregar_Producto_2 
		clickOnElementWait(10,btnProduct2);
		clickOnElementWait(10,btnAddCart);
		acceptAlert();
		clickOnElement(btnHome);
		
		//Agregar_Producto_3
		clickOnElementWait(10,btnProduct3);
		clickOnElementWait(10,btnAddCart);
		acceptAlert();
		clickOnElement(btnHome);
		
		//Agregar_Producto_4
		clickOnElementWait(10,btnProduct4);
		clickOnElementWait(10,btnAddCart);
		acceptAlert();
		clickOnElement(btnHome);
		*/
	}
}
