package openNewTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goofb {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
	}
}