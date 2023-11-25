package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

		WebDriver driver;

		public void init()
		{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
		}
		public void openLink(String url)
		{
			driver.get(url);
		}
		public void close()
		{
			driver.close();
		}
}
