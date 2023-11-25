package windowHandle;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyrTutorials 
{
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		
		Set<String> se=driver.getWindowHandles();
		
		for(String win:se)
		{
			if(!win.equals(parentWindow))
			{
				driver.switchTo().window(win);
				String text=driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div[1]/div[1]/div/h1")).getText();
				System.out.println(text);
			}
		}
	}
}