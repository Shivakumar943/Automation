package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singleclmn {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> rw=driver.findElements(By.xpath("//table[@id='customers']//tr//td[1]"));
		
//		for(int i=1;i<=rw.size();i++)
//		{
//			System.out.println(rw.get(i).getText());
//		}
//		driver.close();
		
		System.out.println(rw.size());
		
		
	}

}
