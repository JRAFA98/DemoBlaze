package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsCart extends BasePage {

	@FindBy(xpath = "//div[@id=\"page-wrapper\"]/div/div[2]/div/div")
	WebElement layoutTotal;
	
	@FindBy(xpath = "/html/body/div[10]")
	WebElement LayoutMesaje;
	
	@FindBy(id = "totalp")
	WebElement labelTotal;

	public DetailsCart(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public Boolean isDisplayLayoutTotal() {
		return isDisplay(layoutTotal);
	}

	public String getTotal() {
		return getTextOnElement(labelTotal);
	}
	
	public Boolean isDisplayLayoutOrder() {
		return isDisplay(LayoutMesaje);
	}
}
