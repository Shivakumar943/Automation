package screenShot;
	
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoShot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		//go to url
		driver.get("https://www.facebook.com/");
		
		//Locate the particular element
		WebElement wb = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		File source = wb.getScreenshotAs(OutputType.FILE);
		File dest =new  File(".\\screenShot\\Logo.png");
		FileUtils.copyFile(source, dest);
		driver.close();
	}
}