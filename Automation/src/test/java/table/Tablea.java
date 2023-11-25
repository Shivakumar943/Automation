package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablea 
{
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/table");
	
	List<WebElement> rw = driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr"));  //table[@id='webtable']//tbody//tr
	List<WebElement> clm = driver.findElements(By.xpath("//table[@id='webtable']//tbody//tr/th"));

	
	
	
	
	System.out.println(clm.size());
	
	for(int i=2;i<rw.size();i++)
	{
		for(int j=1;j<=clm.size();j++)
		{
			String res=driver.findElement(By.xpath(" //table[@id='webtable']//tbody//tr[" +  i + " ]//td[" + j +"] ")).getText();
			
			System.out.print(res+ " | ");
		}
		System.out.println();
	}
	}
}