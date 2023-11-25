package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbUtility 
{
	WebDriver driver;
	
	
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public void openUrl(String url)
	{
		driver.get(url);
	}
	
	public void addElements(String uname)
	{
		driver.findElement(By.id("email")).sendKeys(uname);;
	}

	public void addpass(String pass)
	{
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
	
	public void close()
	{
		driver.close();
	}
}
