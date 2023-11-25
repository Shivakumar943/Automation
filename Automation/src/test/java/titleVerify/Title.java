package titleVerify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Title {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String expectedTitle="Google";
		
		driver.get("https://www.google.com/");
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test failed");
		}
		driver.close();
	}

}
