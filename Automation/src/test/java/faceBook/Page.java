package faceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page 
{
	WebDriver driver;
	
	public Page(WebDriver d)
	{
		this.driver=d;
		
		PageFactory.initElements(driver, this);
	}
	
	private @FindBy(id="email")
	WebElement username;
	
	private @FindBy(id="pass")
	WebElement passWord;
	
	private @FindBy(xpath ="//button[@value='1']")
	WebElement button;
	
	public void enterUserName(String email)
	{
		username.sendKeys(email);
	}
	
	public void enterUserPassword(String pass)
	{
		passWord.sendKeys(pass);
	}
	
	public void enterButton()
	{
		button.click();
	}
}