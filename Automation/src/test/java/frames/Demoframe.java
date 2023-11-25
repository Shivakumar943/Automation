package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoframe 
{
	WebDriver driver;

	@BeforeTest
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		
	}
	
//	@Test(enabled=false)
//	public void frame()
//	{
//		
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		
//		driver.manage().window().maximize();
//		
//		WebElement frmane=driver.findElement(By.id("singleframe"));
//		
//		driver.switchTo().frame(frmane);
//		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shivakumar");
//	}
	
	@Test
	public void chercher()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		
		driver.get("https://chercher.tech/practice/frames");
		
		WebElement frame1=driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/input")).sendKeys("23345654");
		
		WebElement frame2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame2);
		
		WebElement select=driver.findElement(By.id("animals"));
		
		Select sel=new Select(select);
		sel.selectByIndex(2);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		try
		{
			Thread.sleep(3000);
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}