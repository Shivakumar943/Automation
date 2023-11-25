package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
	
		driver.get("https://www.cricbuzz.com/");
		
		TakesScreenshot shot=(TakesScreenshot)driver;
		File fs=shot.getScreenshotAs(OutputType.FILE);
		File des=new File(".\\screenShot\\cricbuzz.png");
		FileUtils.copyFile(fs, des);
		driver.close();
	}
}