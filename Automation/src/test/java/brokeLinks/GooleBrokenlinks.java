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

public class GooleBrokenlinks {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
		List<WebElement> ls= driver.findElements(By.tagName("a"));
		
		System.out.println(ls.size());
		
		for(int i=0;i<ls.size();i++)
		{
			WebElement attribute = ls.get(i);
			String hrf=attribute.getAttribute("href");
			
			URL rl=new URL(hrf);
			
			HttpURLConnection conn=(HttpURLConnection)rl.openConnection();
			conn.connect();
			int res=conn.getResponseCode();
			
			if(res>=400)
			{
				System.out.println(hrf);
			}else
			{
				System.out.println("No BrokenLinks are present here");
				break;
			}
		}
		driver.close();
	}
}