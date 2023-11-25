package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRowsClum {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> wb=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr"));
		System.out.println("TheSiz is : "+ wb.size());
		
		List<WebElement> clm=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr/td"));
		System.out.println("Column : "+clm.size());
		
		
		for(int i=1;i<wb.size();i++)
		{
			for(int j=0;j<clm.size();j++)
			{
				String ab=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr["+i+"]/td["+j+"]")).getText();
			}
		}
	}
}