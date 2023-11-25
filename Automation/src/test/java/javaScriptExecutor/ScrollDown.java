 package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown 
{
	public static void main(String[] args) 
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(op);
			
			driver.get("https://www.facebook.com/");
			JavascriptExecutor js=(JavascriptExecutor) driver;
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}