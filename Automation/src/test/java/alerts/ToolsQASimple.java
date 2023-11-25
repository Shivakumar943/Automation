package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQASimple 
{
	WebDriver driver;
	WebDriverWait wait;
	@Test
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void alert()
	{
		try
		{
			//Simple alert
			WebElement sa=driver.findElement(By.xpath("//button[@id='alertButton']"));
			sa.click();
			
			Alert al=driver.switchTo().alert();
			
			System.out.println(" Simple Alert : "+al.getText());
			al.accept();
			
//			//Confirmation alert
//			WebElement time=driver.findElement(By.xpath("//button[@id='confirmButton']"));
//			time.click();
//			
//			Alert alrt=driver.switchTo().alert();
//			Thread.sleep(2000);
//			System.out.println(" This is Text what i wanted "+alrt.getText());
//			
//			alrt.accept();
//			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void winn()
	{
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}