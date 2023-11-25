package faceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbPage 
{
	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test;
	WebDriver driver;
	SoftAssert asser;
	
	@BeforeTest
	public void launch()
	{
		spark = new ExtentSparkReporter("MyReportt.html");
		report = new ExtentReports();
		report.attachReporter(spark);
		
		report.setSystemInfo("User", "shiva");
		report.setSystemInfo("OS","Windows11");
		report.setSystemInfo("Browser","Chrome");
		
		spark.config().setDocumentTitle("FaceBook Report Demo");
		spark.config().setReportName("Validate FaceBook");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setTimeStampFormat("MM YYYY , hh:mm");
	}
	
	@Test
	public void run()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		
		test=report.createTest("BrowserLAunched");
		driver.get("https://www.facebook.com/");
		
		Page p=new Page(driver);
		test=report.createTest("Username name has been entered successfully");
		p.enterUserName("shivakumar");
		test=report.createTest("Password name has been entered successfully");
		p.enterUserPassword("asdfghj");
		test=report.createTest("LohIn has been successfully");
		p.enterButton();
		
		String expected="faceBook";
		
		String actualTitle=driver.getTitle();

		test=report.createTest("Titleverification....");
		asser.assertEquals(expected,actualTitle);
		
		test=report.createTest("Failed....");
		
		
		driver.close();
	}
	
//	@Test
//	public void validatetitle()
//	{
//		
//	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAIL ",ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS , MarkupHelper.createLabel(result.getName() + " PASS ",ExtentColor.GREEN));
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		report.flush();
	}
}