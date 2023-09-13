package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageFactory.Loginpage_PF;
import pages.*;

public class LoginStepsPF {
	WebDriver driver = null;

	Loginpage_PF login;

	@Before
	public void setup() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.manage().window().maximize();
	}

	@Given("User is on Loging Page")
	public void user_is_on_loging_page() {

		driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {

		login = new Loginpage_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		// login=new Loginpage_PF(driver);
		login.clickLogin();
	}

	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {

		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
