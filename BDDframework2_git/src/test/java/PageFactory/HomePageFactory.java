package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	
	WebDriver driver;
	public HomePageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//i[@class='fa fa-home']")
	WebElement lbl_home;
	
	public void isHomeDisplayed()
	{
		lbl_home.isDisplayed();
	}
	
	

}
