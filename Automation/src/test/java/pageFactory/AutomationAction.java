package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationAction 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);

		driver.get("http://automationpractice.pl/index.php?controller=authentication&back=my-account");
		
		AutomationScript as=new AutomationScript(driver);
		as.enterMail("asdfgh@gmail.com");
		Thread.sleep(2000);
		as.clickclick();
		driver.close();
	}
}