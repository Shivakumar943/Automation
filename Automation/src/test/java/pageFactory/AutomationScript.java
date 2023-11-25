package pageFactory;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationScript 
{
	WebDriver driver;
	
	public AutomationScript(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	      
	@FindBy(id="email_create")
	private WebElement enterUserName;
	
	public void enterMail(String mail)
	{
		enterUserName.sendKeys(mail);
	}
	
	@FindBy(id="SubmitCreate")
	private WebElement button;
	
	public void clickclick()
	{
		button.click();
	}
}