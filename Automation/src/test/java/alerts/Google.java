package alerts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Google 
{
	public static void main(String[] args) 
	{
	
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.google.com/");
		System.out.println("i am executed.......!!");
		driver.close();
	}
}