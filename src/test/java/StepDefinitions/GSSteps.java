package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GSSteps {
	WebDriver driver=null;

	@Given("Browser is opened")
	public void browser_is_opened() {
	    System.out.println("Browser opened");
	    
	    String projectPath=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath + "/src/test/resources/drivers/chromedriver.exe");
	
	    
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	    
	    driver.manage().window().maximize();
	}
	@When("User enters Text")
	public void user_enters_text() {
		System.out.println("User enters Text");
		driver.navigate().to("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}
	@When("Hit Enter")
	public void hit_enter() {
		System.out.println("Enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("Navigate to Result")
	public void navigate_to_result() {
		System.out.println("Navigate");
		driver.getPageSource().contains("Online Courses");
		
		driver.close();
		driver.quit();
		}
}
