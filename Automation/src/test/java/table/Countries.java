package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Countries {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='countries']//tbody//tr"));
		
		List<WebElement> clum=driver.findElements(By.xpath("//table[@id='countries']//tbody//tr[100]//td[2]"));
		
		System.out.println(rows.size());
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}
}