package windowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NextGen {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		String wind=driver.getWindowHandle();
		
		driver.findElement(By.id("button1")).click();
		
		Set<String> winds=driver.getWindowHandles();
		
		for(String w:winds)
		{
			if(!w.endsWith(wind))
			{
				driver.switchTo().window(w);
				driver.manage().window().maximize();
				System.out.println(" Child Window : "+driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(wind);
		driver.findElement(By.xpath("//button[@name='123newmessagewindow321']")).click();
	}
}