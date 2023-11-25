package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QAFox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> rw=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		
		System.out.println( rw.size());
		
		List<WebElement> clm=driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td"));
		
		System.out.println(clm.size());
		
		for(int i=1;i<rw.size();i++)
		{
			System.out.println(rw.get(i).getText());
		
		}
	}
}