package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.TransactionPage;
import pages.dashBoardPage;
import pages.logInPage;
import util.BrowserFactory;

public class LogInTest {

	WebDriver driver;

	@BeforeTest
	
	public void lunchBrowser() {
	  
	  driver = BrowserFactory.startBrowser();
	  }
  @Test
  public void userShouldLogIn() throws InterruptedException
  {
	  
	driver.get("http://techfios.com/test/billing/?ng=admin/");  
	  
  
	logInPage loginPage = PageFactory.initElements(driver, logInPage.class);
	String expectedTitle = "Login - TechFios Test Application - Billing";
	String actualTitle = loginPage.getPageTitle(); 
	System.out.println(actualTitle); 
	Assert.assertEquals(actualTitle, expectedTitle, "Wrong page!");
  loginPage.login("techfiosdemo@gmail.com", "abc123");
	
	dashBoardPage dashboard = PageFactory.initElements(driver, dashBoardPage.class);
    
    	dashboard.waitForPage();	
    	Thread.sleep(3000);
    	
    	dashboard.clickOnAddDepositButton();
    	Thread.sleep(3000);
    	TransactionPage transaction = PageFactory.initElements(driver, TransactionPage.class);

    	transaction.TransactionPageTitle();
    	transaction.NewDeposit();
    	Thread.sleep(3000);
    	
    	
    	TransactionPage transaction1 = PageFactory.initElements(driver, TransactionPage.class);
    
    	transaction1.AddDeposit("Stine453","Fun777", "10000");
    	Thread.sleep(5000);
    	
  
  }
 
	@AfterMethod
	public void close() {
		
		driver.close();
		driver.quit();
		
	}
	
}
  
