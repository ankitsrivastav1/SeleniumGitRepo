package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.*;

public class LoginSteps {
//	WebDriver driver = null;
//
//	loginPage login;
//
//	@Given("User opens Browser")
//	public void user_opens_browser() {
//
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//
//		driver.manage().window().maximize();
//	}
//
//	@And("User is on Loging Page")
//	public void user_is_on_loging_page() {
//
//		driver.navigate().to("https://www.saucedemo.com/");
//	}
//
//	@When("^User enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//
//		login = new loginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@And("clicks on Login button")
//	public void clicks_on_login_button() {
//		login = new loginPage(driver);
//		login.clickLogin();
//	}
//
//	@Then("User is navigated to Home page")
//	public void user_is_navigated_to_home_page() throws InterruptedException {
//		driver.getPageSource().contains("Products");
//
//		Thread.sleep(4000);
//
//		driver.close();
//		driver.quit();
//	}

}
