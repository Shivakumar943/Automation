package packagRealTime;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read 
{
	public static void main(String[] args) 
	{
		try
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			FileInputStream fs=new FileInputStream("C:\\Users\\MWCL\\eclipse-workspace\\Automation\\src\\test\\java\\packagRealTime\\Info.properties");
			Properties pro=new Properties();
			pro.load(fs);
			
			driver.get(pro.getProperty("url"));
			
			Thread.sleep(2000);
			
			driver.close();
			
				
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}