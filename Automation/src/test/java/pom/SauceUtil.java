
package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceUtil 
{
	WebDriver driver;
	
	SauceUtil(WebDriver d)
	{
		driver=d;
	}
	
	
	By name=By.id("user-name");
	By pass=By.id("password");
	By btn=By.id("login-button");
	
	
	public void userName(String na)
	{
		driver.findElement(name).sendKeys(na);
	}
	
	public void passWord(String nam)
	{
		driver.findElement(pass).sendKeys(nam);
	}
	public void btn()
	{
		driver.findElement(btn).click();
	}
	
}
