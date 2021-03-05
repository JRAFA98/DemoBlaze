package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	WebDriverWait wait;
	private static final Logger logger = LogManager.getLogger();

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void typeOnElement(WebElement element, String text, int seconds) {
		try {
			wait = new WebDriverWait(this.driver, seconds);
			wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(text);
			logger.info("Type on element: " + element + " , Data: "+ text);
		} catch(Exception e) {
	    	logger.error("Unable type on element: " + e);
	    }
	}

	public void clickOnElement(WebElement element, int seconds) {
		try {
			wait = new WebDriverWait(this.driver, seconds);
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			logger.info("Clicked on element: " + element);	
	    } catch(Exception e) {
	    	logger.error("Unable to click on element: " + e);
	    }
	}

	public void acceptAlert(int seconds) {
		try {
			wait = new WebDriverWait(this.driver, seconds);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
			logger.info("Accept alert");	
	    } catch(Exception e) {
	    	logger.error("Accept alert: " + e);
	    }
			
	}

	public void cancelAlert(int seconds) {
		try {
			wait = new WebDriverWait(this.driver, seconds);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
			logger.info("Dismiss alert");	
	    } catch(Exception e) {
	    	logger.error("Dismiss alert: " + e);
	    }
	}
}
