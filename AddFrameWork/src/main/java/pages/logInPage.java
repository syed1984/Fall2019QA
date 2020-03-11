package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logInPage {
	
	WebDriver driver;
	
	public  logInPage(WebDriver driver)
	{
		
		this.driver = driver;
		}
    @FindBy(how = How.ID,using = "username")
    WebElement UserName;
    @FindBy(how = How.ID,using = "password")
    WebElement PassWord;
    @FindBy(how = How.NAME,using = "login")
    WebElement SignInButton;
    
    
    public void login(String username, String password) {
    	
    	UserName.sendKeys("techfiosdemo@gmail.com");
    	PassWord.sendKeys("abc123");
    	SignInButton.click();
    	
    	
    }


	public String getPageTitle() {
		
		return driver.getTitle();
	}
    
}

