package windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HWindow 
{
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);	
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String win:child)
		{
			driver.switchTo().window(win);
			if(!win.equals(parent))
			{
				driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Shivakumar");
			}else
				if(win.equals(parent))
				{
					driver.switchTo().window(win);
					driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("shivakumar");
				}
		}
		driver.close();
	}
}