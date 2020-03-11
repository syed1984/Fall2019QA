package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class dashBoardPage {

	WebDriver driver;
	
	public dashBoardPage(WebDriver driver)
	{
		
		this.driver = driver;
		
	}
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Dashboard')]")
	WebElement PageTitle;
	@FindBy(how = How.LINK_TEXT, using = "Add Deposit")
	WebElement AddDepositButton;
	
	public void waitForPage() {
		waitForElement(PageTitle, driver);
		}

		private void waitForElement(WebElement pageTitle, WebDriver driver) {
		
		
	}

		public void clickOnAddDepositButton() {
		AddDepositButton.click();
		}

		public boolean isDashboardDisplayed() {
		try {
		waitForPage();
		return true;
		} catch (Exception e) {

		}
		return false;
		}
	
}


