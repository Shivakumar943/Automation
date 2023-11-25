package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tab {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"newTabBtn\"]")).click();
		Set<String> sets=driver.getWindowHandles();
			
			driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("abcd");
		
	}
}
