import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindString 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://cursa.app/en/teacher/guru99");
		
		WebElement wb=driver.findElement(By.xpath("//p[text()='At Guru99 you learn by Practical examples. We have unique videos for topics related to Software Engineering. We have Multilanguage videos, so everyone can learn! We have provided training to more than 100 million people. Helped our students to learn new skills, get better jobs, and get better pay! We make tons of efforts to make education a fun experience.']"));
	
		String get="miqqwdfgsbndkdjson";
		
		String ab=wb.getText();
		
		//System.out.println(ab);
		
		String[] sp=ab.split(" ");
		
		for(int i=0;i<sp.length;i++)
		{
			if(sp[i].equals(get));
				System.out.println("The Word is found at index of :");
			
				System.out.println("The Word is found at index of :");
		}
	}
}