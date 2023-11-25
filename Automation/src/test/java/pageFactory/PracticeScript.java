package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeScript 
{
	WebDriver driver;
	@Test
	public void launch() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		
		driver.get("https://www.facebook.com/");
		
		PracticeLocate pl=new PracticeLocate(driver);
		pl.userName("Shivakumar");
		Thread.sleep(2000);
		pl.btn();
	}

}
