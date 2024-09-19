package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By txt_username = By.id("userEmail");
	By txt_password = By.id("userPassword");
	By btn_login = By.id("login");
	By lbl_xpath = By.xpath("//h3[normalize-space()='Automation']");
	
	public void enterUsername(String username)
	{
	   driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login).click();
	}
	
	public void isLogoDisplayed()
	{
		driver.findElement(lbl_xpath).isDisplayed();
	}
	
	
	

}
