package guruBankProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	WebDriver driver;
	
	Pom(WebDriver idriver)
	{
		driver=idriver;
		
		PageFactory.initElements(idriver,this);
	}
	@FindBy(id="email")
	WebElement userame;
	
	@FindBy(id="password")
	WebElement pssword;
	
	public void usr(String name)
	{
		userame.sendKeys(name);
	}
	public void pass(String pass)
	{
		pssword.sendKeys(pass);
	}
	public void close()
	{
		driver.close();
	}
}