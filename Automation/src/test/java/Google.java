import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google 
{
	@Test
	public void launch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		
		Set<String> childs=driver.getWindowHandles();
		
		for(String s:childs)
		{
			driver.switchTo().window(s);
			if(!s.equals(parent))
			{
				driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("shivakumar");
			}
		}
		Thread.sleep(2000);
		
		driver.close();
	}
}