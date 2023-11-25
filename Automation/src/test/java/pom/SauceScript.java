package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		SauceUtil su=new SauceUtil(driver);
		
		driver.get("https://www.saucedemo.com/");
		
		su.userName("standard_user");
		Thread.sleep(2000);
		su.passWord("secret_sauce");
		Thread.sleep(2000);
		su.btn();
	}
}
