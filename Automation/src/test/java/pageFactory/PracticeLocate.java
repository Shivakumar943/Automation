package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeLocate 
{
	WebDriver driver;
	
	public PracticeLocate(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement um;
	
	@FindBy(xpath="//button[@value='1']")
	WebElement b;
	
	public void userName(String name)
	{
		um.sendKeys(name);
	}
	
	public void btn()
	{
		b.click();
	}
}
