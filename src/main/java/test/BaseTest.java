package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		String url = "https://www.demoblaze.com/index.html";
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void tearDown() {
		driver.quit();
	}
}
