package datepicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op =new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("datepicker1")).click();
		
		String mon="November";
		String yer="2030";
		String da="6";
		
		while(true)
		{
			String mo=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mo.equals(mon) && (yr.equals(yer)))
			{
				break;
			}else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
		List<WebElement> aldt=driver.findElements(By.xpath("//table//tbody//td"));
		for(WebElement al:aldt)
		{
			String gett=al.getText();
			if(gett.equals(da))
			{
				al.click();
				break;
			}
		}
	}
}