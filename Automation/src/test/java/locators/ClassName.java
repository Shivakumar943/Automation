package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassName {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("shivakumar");
		
		driver.findElement(By.id("email")).sendKeys("shivakumar");
		
		
		
		driver.close();
	}
}