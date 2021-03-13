package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	private WebDriverWait wait;
	private static final Logger logger = LogManager.getLogger();

	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 10);
	}

	public void typeOnElement(WebElement element, String text) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
			logger.info("Type on element: " + element + " , Data: " + text);
		} catch (Exception e) {
			logger.error("Unable type on element: " + e);
		}
	}

	public void clickOnElement(WebElement element) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			logger.info("Clicked on element: " + element);
		} catch (Exception e) {
			logger.error("Unable to click on element: " + e);
		}
	}

	public String getTextOnElement(WebElement element) {
		String dato = "";
		try {
			dato = wait.until(ExpectedConditions.elementToBeClickable(element)).getText();
			logger.info("Clicked on element: " + element);
		} catch (Exception e) {
			logger.error("Unable to click on element: " + e);
		}

		return dato;
	}

	public Boolean isDisplay(WebElement element) {
		Boolean dato = false;
		try {
			dato = wait.until(ExpectedConditions.elementToBeClickable(element)).isDisplayed();
			logger.info("Clicked on element: " + element);
		} catch (Exception e) {
			logger.error("Unable to click on element: " + e);
		}

		return dato;
	}

	public void acceptAlert() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			logger.info("Accept alert");
		} catch (Exception e) {
			logger.error("Accept alert: " + e);
		}

	}

	public void cancelAlert() {
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			logger.info("Dismiss alert");
		} catch (Exception e) {
			logger.error("Dismiss alert: " + e);
		}
	}
}
