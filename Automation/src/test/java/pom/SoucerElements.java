package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoucerElements 
{
	WebDriver driver;
	
	public SoucerElements(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement username;
	
	public void Uname(String name)
	{
		username.sendKeys(name);
	}
	
	public void close()
	{
		driver.close();
	}
}
