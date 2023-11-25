package waits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver 
{
	public static void main(String[] args) 
	{
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("asdfghjklmnbnvczsqq")).click();
//		
//		Wait wait=new WebDriverWait(WebDriver driver,20);
		
	}
} 