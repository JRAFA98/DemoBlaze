package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	@FindBy (id="login2")
	WebElement btnMakeAppt;
	
	@FindBy (id="loginusername")
	WebElement usernameField;
	
	@FindBy (id="loginpassword")
	WebElement pwdField;
	
	@FindBy (xpath ="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	WebElement btnLogin;

	WebDriver driver;
	public LoginPage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String user, String pwd) {
		clickOnElement(btnMakeAppt);
		typeOnElementWait(10,usernameField,user);
		typeOnElementWait(10,pwdField,user);
		clickOnElementWait(10,btnLogin);
	}
}
