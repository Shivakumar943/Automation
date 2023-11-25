package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		
		WebElement wb=driver.findElement(By.xpath    ("//*[@id=\"Multiple\"]/iframe"));
		
		driver.switchTo().frame(wb);
		
		WebElement w=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		driver.switchTo().frame(w);
		
		
		String s=driver.findElement(By.xpath("/html/body/section/div/h5")).getText();
		System.out.println(s);
		
	
		//System.out.println("the name of title : "+ driver.getTitle() );

		driver.close();
	}
}