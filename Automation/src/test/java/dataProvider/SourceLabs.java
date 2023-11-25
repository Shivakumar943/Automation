package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SourceLabs 
{

	@Test(dataProvider="enterUsernamePass")
	public void display(String email,String pass) throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	@DataProvider()
	public Object[][] enterUsernamePass()
	{
		return new Object[][]
				{
					{"standard_user","secret_sauce"},
					{"problem_user","secret_sauce"},
					{"performance_glitch_user","secret_sauce"}
				};
	}
	
}