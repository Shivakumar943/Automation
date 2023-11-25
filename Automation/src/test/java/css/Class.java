package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class      //    [class='value']
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();      
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement wb=driver.findElement(By.cssSelector("[class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		wb.click();
	}
}