package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class TransactionPage {

	WebDriver driver;
	
	public TransactionPage(WebDriver driver) {
		
		this.driver = driver;
		}
	
	
	@FindBy(how = How.XPATH,using = "//h2[contains(text(),'Transactions')]")
	WebElement TransactionPageTitle;
	@FindBy(how = How.XPATH,using = "//a[contains(text(),'New Deposit')]")
	WebElement NewDeposit;
	
	
	public void TransactionPageTitle() {
		
		waitForElement(TransactionPageTitle, driver);
	}


	private void waitForElement(WebElement transactionPageTitle2, WebDriver driver2) {
		
		}
	
	public void NewDeposit() {
		
		NewDeposit.click();
	}
	
	
	
	@FindBy(how = How.ID,using = "account")
	WebElement SelectAccount;
	@FindBy(how = How.ID,using = "description")
	WebElement Description;
	@FindBy(how = How.ID,using = "amount")
	WebElement Amount;
	@FindBy(how = How.ID,using = "submit")
	WebElement SubmitButton;
	
	
	
		

	
	public void AddDeposit(String aacount, String description, String amount) {
		
	SelectAccount.sendKeys("Stine453");
	Description.sendKeys("Fun777");
	Amount.sendKeys("10000");
	SubmitButton.click();
	
	}
	
	
	
}
