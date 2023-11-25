package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbPomClassScript {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		FbPomClass pom=new FbPomClass(driver);
		
		driver.get("https://www.facebook.com/");
		
		pom.userName("shivakumar");
		pom.userPassword("asdfgh");

		
	}

}
