package handleTheTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTable {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//table[@id='table1']"));
				
		List<WebElement> r=driver.findElements(By.xpath("//table[@id='table1']//th"));
		System.out.println("TOtal number of roes are : "+r.size());
		
		
		List<WebElement> c=driver.findElements(By.xpath("//table[@id='table1']//tr[3]//td[3]"));
		
		System.out.println(c.size());
	
		for(int i=1;i<r.size();i++)
		{
			for(int j=1;j<c.size();j++)
			{
				String data = driver.findElement(By.xpath("//table[@id='table1']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data);
			}
			System.out.println();
		}
		driver.close();
	}
}