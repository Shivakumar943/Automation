package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GautamAdani {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://stats.areppim.com/listes/list_billionairesx14xwor.htm");
		
		WebElement wb=dr.findElement(By.xpath("//table[@class='stats']//tbody//tr[611]//td[2]"));
		
		WebElement w=dr.findElement(By.xpath("//table[@class='stats']//tbody//tr[611]//td[1]"));
		
		System.out.println(w.getText() +" " + wb.getText());
	}
}