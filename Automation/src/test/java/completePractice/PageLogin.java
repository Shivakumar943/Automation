package completePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin 
{
	WebDriver driver;
	
	public PageLogin(WebDriver d)
	{
		this.driver = d;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name") private WebElement userName;
	
	@FindBy(id="password") private WebElement password;
	
	@FindBy(id="login-button") private WebElement button;
	
	public void enterUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterButton()
	{
		button.click();
	}
}