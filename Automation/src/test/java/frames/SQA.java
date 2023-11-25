package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SQA 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
		
		driver.switchTo().frame(frame);
		
		WebElement select= driver.findElement(By.id("selectnav1"));
		
		Select sel=new Select(select);
		Thread.sleep(2000);
		sel.selectByIndex(8);
		
		driver.close();
		
	}
}