package propertiesFacebook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{
	public static void main(String[] args) throws IOException 
	{

		Properties pro=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\MWCL\\eclipse-workspace\\Automation\\src\\test\\java\\properties\\Facebook.properties");
		
		pro.load(fs);
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);

		
		String url= pro.getProperty("url");
		
		driver.get(url);
	}
}