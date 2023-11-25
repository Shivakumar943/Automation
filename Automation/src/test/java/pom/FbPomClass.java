package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbPomClass 
{
	WebDriver driver;
	
	FbPomClass(WebDriver d)
	{
		driver=d;
	}
	
	By name=By.id("email");
	By passwrd=By.id("pass");
	
	public void userName(String s)
	{
		driver.findElement(name).sendKeys(s);
	}
	
	public void userPassword(String p)
	{
		driver.findElement(passwrd).sendKeys(p);
	}
}