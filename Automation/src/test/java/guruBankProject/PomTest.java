package guruBankProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Pom po=new Pom(driver);
		
		po.usr("shivakumar");
		po.pass("asdfg");
		po.close();
	}
}