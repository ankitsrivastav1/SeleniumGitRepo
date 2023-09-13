package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_PF {
 @FindBy(id="user-name")
 @CacheLookup
 WebElement txt_username;

 @FindBy(id="password")
 @CacheLookup
 WebElement txt_password;
 
 @FindBy(id="login-button")
 @CacheLookup
 WebElement btn_login;
 
 WebDriver driver;
 public Loginpage_PF(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 

 public void enterUsername(String username) {
	 txt_username.sendKeys(username);

	}

	public void enterPassword(String password) {

		txt_password.sendKeys(password);
	}

	public void clickLogin() {

		btn_login.click();
	}
}
	
