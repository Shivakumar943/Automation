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

public class Udri 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
	
		List <WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			WebElement link=list.get(i);
			String hrf=link.getAttribute("href");
			
			URL rl=new URL(hrf);
			
			HttpURLConnection conn= (HttpURLConnection) rl.openConnection();
			conn.connect();
			
			int code=conn.getResponseCode();
			
			if(code>=400)
			{
				System.out.println("List of links are : "+ hrf);
			}else
			{
				System.out.println("No Broken links are present");
				break;
			}
		}
		driver.close();
	}
}