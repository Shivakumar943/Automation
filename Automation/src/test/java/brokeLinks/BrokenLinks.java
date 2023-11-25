package brokeLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		//driver.get("https://www.facebook.com/");
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>ls=driver.findElements(By.tagName("a"));
		System.out.println(ls.size());
		
		for(int i=0;i<ls.size();i++)
		{
			WebElement get=ls.get(i);
			String hrf=get.getAttribute("href");
			URL rl=new URL(hrf);
			HttpURLConnection htp= (HttpURLConnection) rl.openConnection();
//			htp.setRequestMethod("HEAD");
			htp.connect();
			int res=htp.getResponseCode();
			
			if(res>=400)
			{
				System.out.println(hrf+"is the broken link");
			}else
			{
				System.out.println("There are no broken links");
				break;
			}
		}
		driver.close();
	}
}