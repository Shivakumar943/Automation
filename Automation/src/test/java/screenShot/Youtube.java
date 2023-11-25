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

public class Youtube 
{
	public static void main(String[] args) throws IOException 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.youtube.com/watch?v=jmObajLF4jQ&t=6s");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fs=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(".\\screenShot\\YT.png");
		FileUtils.copyFile(fs, des);
	}
}