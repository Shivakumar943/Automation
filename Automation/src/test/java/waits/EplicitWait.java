package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EplicitWait 
{
	@Test
	public void Waitt() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		
//		WebElement ewait=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("alert")));
//		
//		ewait.click();
		driver.close();
	}
}