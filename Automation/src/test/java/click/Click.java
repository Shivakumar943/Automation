package click;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("sfftyee")).click();
		

		///////////////// Another way ///////////////////   "Keys.ENTER"
		
		
		driver.findElement(By.xpath("afsgssks")).sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("afsgssks")).sendKeys(Keys.RETURN);
		
		
		
		
	}
}