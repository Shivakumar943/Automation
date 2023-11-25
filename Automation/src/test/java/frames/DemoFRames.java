package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoFRames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");

		WebElement wb=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	
		driver.switchTo().frame(wb);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shivakumar");
	}
}