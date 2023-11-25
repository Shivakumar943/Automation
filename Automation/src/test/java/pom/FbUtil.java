package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbUtil 
{
	WebDriver driver;
	
	FbUtil(WebDriver d)
	{
		driver=d;
	}
	
	By uname=By.id("email");
	
	By passwrd=By.id("pass");
	
	By btn=By.id("u_0_5_ss");
	
	
	public void userName(String name)
	{
		driver.findElement(uname).sendKeys(name);
	}
	
	public void userPass(String pass)
	{
		driver.findElement(passwrd).sendKeys(pass);
	}
	
	public void button()
	{
		driver.findElement(btn).click();
	}
}