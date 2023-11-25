package brokeLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guru {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/");
		List<WebElement> ls=driver.findElements(By.tagName("a"));
		
		System.out.println(ls.size());
		
		for(int i=0;i<ls.size();i++)
		{
			WebElement get=ls.get(i);
			String at=get.getAttribute("href");
			
			URL rl=new URL(at);
			HttpURLConnection con=(HttpURLConnection) rl.openConnection();
			con.connect();
			int code=con.getResponseCode();
			
			if(code>=400)
			{
				System.out.println(at);
			}else
			{
				System.out.println("No links are present");
				break;
			}
		}
		driver.close();
	}
}