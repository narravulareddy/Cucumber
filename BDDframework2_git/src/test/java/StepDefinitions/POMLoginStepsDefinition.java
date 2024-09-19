//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.LoginPage;
//
//public class POMLoginStepsDefinition {
//	
//	WebDriver driver;
//	LoginPage login;
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//		
//	    driver = new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    driver.get("https://rahulshettyacademy.com/client");
//	}
//
//	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_and(String username, String password) {
//		login = new LoginPage(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
//	}
//
//	@When("Clicks on login button")
//	public void clicks_on_login_button() {
//		
//		login.clickLogin();
//	}
//
//	@Then("User is navigate to home page")
//	public void user_is_navigate_to_home_page() {
//		
//		login.isLogoDisplayed();
//	    
//	}
//
//	@Then("Close the browser")
//	public void close_the_browser() {
//		driver.close();
//	    
//	}
//
//}
