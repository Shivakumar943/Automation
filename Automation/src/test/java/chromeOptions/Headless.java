package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html");
		
		
		System.out.println(driver.getCurrentUrl());		
		//driver.close();
	}

}
