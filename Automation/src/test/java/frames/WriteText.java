package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteText {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Shivakumar");
		
		Thread.sleep(2000);
		driver.close();
	}
}
