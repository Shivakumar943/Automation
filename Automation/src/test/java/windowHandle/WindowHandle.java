package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent = driver.getWindowHandle();
		WebElement wb=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		wb.click();

		Set<String> handles = driver.getWindowHandles();
		
		for(String handle:handles)
		{
			driver.switchTo().window(handle);
			
			if(!handle.equals(parent))
			{
				driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("shivakumar");
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Shivakumar");
	}
}