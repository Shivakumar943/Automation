package brokeLinks;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.addArguments("--headless");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> ls=driver.findElements(By.tagName("a"));

		System.out.println(ls.size());
		
		for(int i=0;i<ls.size();i++)
		{
			WebElement b=ls.get(i);
			String link=b.getAttribute("href");
			
			URL url=new URL(link);
			
			HttpsURLConnection htp=(HttpsURLConnection) url.openConnection();
			
			htp.connect();
			int res=htp.getResponseCode();
			
			if(res>=400)
			{
				System.out.println(link + "Are the broken links");
			}else
			{
				System.out.println(" Not Broken Links");
				break;
			}
		}
	}
}