package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tutorialshut 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		String parent=driver.getWindowHandle();
		
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		wb.click();
		Set<String> child=driver.getWindowHandles();
		
		for(String window:child)
		{
			if(window.equals(child))
					{
						driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[8]/div/div[2]/div/div[5]/div/div/a")).click();
					}else
					{
						System.out.println(driver.getTitle());
					}
		}
	
	}
}