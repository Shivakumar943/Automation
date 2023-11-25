package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement w = null;
		List<WebElement> ls=driver.findElements(By.xpath("//select[@name='url']"));

		for(int i=0;i<ls.size();i++)
		{
			w=ls.get(i);
			
		}
		Select sel=new Select(w);
		sel.selectByIndex(3);
	}
}