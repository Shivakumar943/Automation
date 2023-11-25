package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String parent=driver.getWindowHandle();
		
		WebElement wb=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		wb.click();
		
		Set<String> child=driver.getWindowHandles();
		
		Iterator<String> it= child.iterator();
		
		while(it.hasNext())
		{
			String title=it.next();
			
			driver.switchTo().window(title);
			
			if(!driver.getTitle().equals("Frames & windows"))
			{
				driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[5]/a/span")).click();
			}
		}
		driver.quit();
	}
}