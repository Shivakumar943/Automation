package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nestedhyr {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		
		
		
	}

}
