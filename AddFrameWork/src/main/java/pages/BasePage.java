package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		
		}
	
	public static void waitForElement(WebElement pageTitle1, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(pageTitle1));
		
	
	
	}
	
	
}

