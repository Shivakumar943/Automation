package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbScript {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		FbUtil fb=new FbUtil(driver);
		
		driver.get("https://www.facebook.com/");
			
		
		fb.userName("shivakumar");
		fb.userPass("wertyy");
		fb.button();
		
		driver.close();
		
	}
}
