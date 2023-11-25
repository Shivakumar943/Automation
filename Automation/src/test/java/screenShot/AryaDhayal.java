package screenShot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AryaDhayal 
{
	public static void main(String[] args) 
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(op);
			
			driver.get("https://www.youtube.com/watch?v=6Z6nVIKkGfY");
		
			TakesScreenshot ts=(TakesScreenshot)driver;
			File file=ts.getScreenshotAs(OutputType.FILE);
			File destiation=new File(".\\screenShot\\Arya.png");
			FileUtils.copyFile(file, destiation);
			
			driver.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}