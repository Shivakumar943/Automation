package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Utils 
{
	WebDriver driver;
	Utils(WebDriver d)
	{
		driver= d;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	WebElement username;
	
	public void Uname(String name)
	{
		username.sendKeys(name);
	}
}