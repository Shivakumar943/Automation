package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriverManager.chromedriver().setup();
//
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//
//		WebDriver driver=new ChromeDriver(options);
//
//
//		driver.get("https://www.bbc.com/");
//
//		Thread.sleep(5000);
//
//		driver.findElement(By.linkText("Worklife")).click();
//		
		//Documentation
		
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver=new ChromeDriver(options);


		driver.get("https://www.selenium.dev/downloads/");

		Thread.sleep(5000);

		driver.findElement(By.linkText("Documentation")).click();
		
	}
}