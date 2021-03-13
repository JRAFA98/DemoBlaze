package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage extends BasePage {
	
	@FindBy(xpath="//div[@id=\"navbarExample\"]/ul/li[7]")
	WebElement sectionUser;
	
	@FindBy(id="nameofuser")
	WebElement labelUser;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public boolean isDisplayed() {
		return isDisplay(sectionUser);
	}
	
	public String getUser() {
		return getTextOnElement(labelUser);
	}
}