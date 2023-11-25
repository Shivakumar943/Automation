import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		String s="abc";
//		int a=1234;
//		int sum=0;
//		while(a>0)
//		{
//			sum=sum+a%10;
//			a=a/10;
//		}
//		System.out.println(s+""+sum);
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://chat.openai.com/");
		
		Thread.sleep(2000);
		
		driver.close();
	}
}