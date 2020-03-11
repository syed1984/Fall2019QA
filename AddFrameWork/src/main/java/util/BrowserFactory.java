package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pages.logInPage;

public class BrowserFactory {
   
	static WebDriver driver;
	
	public static WebDriver startBrowser() {
		
   System.setProperty("webdriver.chrome.driver","./Chrome21D/chromedriver.exe");
	
   WebDriver driver = new ChromeDriver();
   driver.get("http://techfios.com/test/billing/?ng=admin/");
   return driver;
	}
	
	
	
}
