package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DummyLogibutil 
{
	WebDriver driver;
	
	DummyLogibutil(WebDriver d)
	{
		driver=d;
	}
	
	By name=By.id("username");
	By pass=By.id("password");
	By btn=By.id("submit");
	
	
	public void userName(String mail)
	{
		driver.findElement(name).sendKeys(mail);
	}
	public void pass(String pas)
	{
		driver.findElement(pass).sendKeys(pas);
	}
	public void button()
	{
		driver.findElement(btn).click();
	}
	
}
