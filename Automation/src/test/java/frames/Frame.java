package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframe2\"]")));
		
		WebElement wb=driver.findElement(By.xpath("/html/body/h2[1]"));
		System.out.println(wb.getText());
		driver.close();
	}
}