package completePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public static WebDriver driver;
	public static ExtentSparkReporter ex;
	public static ExtentReports er;
	public static ExtentTest test;
	
	@BeforeTest
	public void launch()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
	}
	
	@BeforeTest
	public void report()
	{
		er=new ExtentReports();
		er.attachReporter(ex);
		
		er.setSystemInfo("User", "Shiva");
		er.setSystemInfo("Browser","chrome");
		er.setSystemInfo("OS","Windows11");
		
		ex.config().setDocumentTitle(" Title ");
		ex.config().setReportName("Title validation");
	}
}