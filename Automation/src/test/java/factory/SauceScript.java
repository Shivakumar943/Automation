package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceScript {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		Factutil fb=new Factutil(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		fb.userName("standard_user");
		fb.userPass("secret_sauce");
		fb.buton();
	}
}
