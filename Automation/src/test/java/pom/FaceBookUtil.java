package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookUtil 
{
	WebDriver driver;
	
	FaceBookUtil(WebDriver idriver)
	{
		driver=idriver;
		
		PageFactory.initElements(idriver, this);
	}
	@FindBy(id="email")
	WebElement userName;
	
	public void uName(String name)
	{
		userName.sendKeys(name);
	}
}