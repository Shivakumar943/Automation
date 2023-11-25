package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Factutil 
{
	WebDriver driver;
	
	Factutil(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, d);
	}
	@FindBy(id="user-name")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login-button")
	WebElement btn;
	
	public void userName(String na)
	{
		uname.sendKeys(na);
	}
	public void userPass(String pa)
	{
		pass.sendKeys(pa);
	}
	public void buton()
	{
		btn.click();
	}
}  