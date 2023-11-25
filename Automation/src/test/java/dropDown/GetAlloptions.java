package dropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAlloptions 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String act="Baby";
		driver.get("https://www.amazon.in/");
		
		Select sel=new Select(driver.findElement(By.xpath("//select[@name='url']")));
		List<WebElement> ls=sel.getOptions();
		
		System.out.println(ls.size());
		int count=1;
		
		for(int i=1;i<ls.size();i++)
		{ 
			System.out.println(ls.get(i).getText());
			count++;  
			System.out.println(count);
		
		for(WebElement wb:ls)
		{
			String all=wb.getText();
			System.out.println(wb.getText());
 			if(all.equals(act))
			{
				System.out.println(all);
			}
		}
	}
}}