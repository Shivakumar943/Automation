package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		
		String get=alt.getText();
		System.out.println(get);
		
		alt.accept();
		
		driver.close();
	}
}
