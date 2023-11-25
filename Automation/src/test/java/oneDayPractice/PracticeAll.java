package oneDayPractice;

import org.openqa.selenium.Alert;
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

public class PracticeAll 
{
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		
		driver.get("http://omayo.blogspot.com/");
//		System.out.println("launchBrowser Suessfully..");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("getTitle....");
	}
	
	@Test
	public void select()
	{
		try
		{
			WebElement select= driver.findElement(By.id("multiselect1"));
			
			Select sel=new Select(select);
			sel.selectByIndex(1);
			Thread.sleep(4000);
			
			sel.selectByVisibleText("Audi");
			Thread.sleep(4000);
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void alerts() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(4000);
		System.out.println(al.getText());
		Thread.sleep(4000);
		al.accept();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}