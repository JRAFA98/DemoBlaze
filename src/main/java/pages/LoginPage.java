package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	@FindBy (id="login2")
	WebElement btnMakeAppt;
	
	@FindBy (id="loginusername")
	WebElement usernameField;
	
	@FindBy (id="loginpassword")
	WebElement pwdField;
	
	@FindBy (xpath ="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	WebElement btnLogin;


	public LoginPage (WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void doLogin(String user, String pwd) {
		clickOnElement(btnMakeAppt, 10);
		typeOnElement(usernameField, user, 10);
		typeOnElement(pwdField, user, 10);
		clickOnElement(btnLogin, 10);
	}
}
