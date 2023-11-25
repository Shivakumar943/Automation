package apachaipoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleData {

	public static void main(String[] args) throws IOException 
	{
		
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(op);
//		
//		driver.get("https://www.saucedemo.com/");
		
//		driver.findElement(By.id("user-name")).sendKeys(xcell.getStringCellValue());
		
		String path="C:\\Users\\MWCL\\Desktop\\username.xlsx";
		FileInputStream stream=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(stream);
		XSSFSheet shet= wb.getSheetAt(0);
		
		int row=shet.getLastRowNum();
		int col=shet.getRow(0).getLastCellNum();
		
		System.out.println(row);
		
		for(int i=0;i<row;i++)
		{
			String cel=shet.getRow(i).toString();
			System.out.println(cel);
		}
		
	}
}