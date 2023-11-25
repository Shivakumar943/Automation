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

public class BrokenLinksDeadLink {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			WebElement wb=list.get(i);
			String hrf=wb.getAttribute("href");
			
			URL rl=new URL(hrf);
			
			HttpURLConnection conn=(HttpURLConnection) rl.openConnection();
			conn.connect();
			
			int res=conn.getResponseCode();
			
			if(res>=400)
			{
				System.out.println("Broken links are : "+hrf.length());
			}else
			{
				System.out.println("No links are present");
				break;
			}
		}
		driver.close();
	}
}