package actionsMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Context 
{
	public static void main(String[] args) 
	{
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions op =new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement wb=driver.findElement(By.linkText("Customer Service"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(wb).click().build().perform();
	}
}