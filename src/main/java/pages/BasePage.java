package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver; 
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	public void typeOnElement(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void clickOnElement(WebElement element) {
		element.click();
	}
	
	public void clickOnElementWait(int seconds, WebElement element){
		WebDriverWait wait = new WebDriverWait(this.driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void typeOnElementWait(int seconds, WebElement element, String text){
		WebDriverWait wait = new WebDriverWait(this.driver, seconds);
		wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
	}
	
	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(this.driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void cancelAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
}
