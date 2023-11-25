package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookScript {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		FaceBookUtil fb=new FaceBookUtil(driver);
		
		driver.get("https://www.facebook.com/");
		
		fb.userName.sendKeys("shivakuamr");
	}

}
