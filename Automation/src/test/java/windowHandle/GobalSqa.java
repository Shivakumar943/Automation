package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GobalSqa 
{
	@Test
	public void windowHandel() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.linkText("New Releases"));
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(frame);
		act.click().build().perform();
		
		driver.close();
	}
}