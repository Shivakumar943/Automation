package failedTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title 
{
WebDriver driver;
	
	@BeforeTest
	public void launch() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		
		driver.get("http://omayo.blogspot.com/");
		
		System.out.println("Browser launched.....");
	}
	
	@Test
	public void handleAlerts() throws InterruptedException
	{
		WebElement al=driver.findElement(By.id("alert1"));
		al.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		System.out.println("Alert handled....");
	}
	
	@Test(enabled=false)
	public void confirmation() throws InterruptedException
	{
		WebElement con=driver.findElement(By.id("confirm"));
		con.click();
		
		Alert co=driver.switchTo().alert();
		System.out.println(co.getText());
		Thread.sleep(2000);
		co.accept();
		
		System.out.println("confirmation()....");
	}
	
	@Test(retryAnalyzer = MyTest.class)

	public void prompt() throws InterruptedException
	{
		WebElement prompt=driver.findElement(By.id("prompt"));
		prompt.click();
		Alert po=driver.switchTo().alert();
		Thread.sleep(2000);
		po.sendKeys("Shivakumar");
		Thread.sleep(2000);
		po.accept();
		System.out.println("Prompt Okay");
		Assert.fail();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Closed successfully....");
	}
}