package extendReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Softassert 
{
	WebDriver driver;
	SoftAssert sa;
	ExtentSparkReporter spark;
	ExtentReports report;
	ExtentTest test;

	@BeforeTest
	public void beforeMethod()
	{
		
		spark=new ExtentSparkReporter("Assert.html");
		report=new ExtentReports();
		report.attachReporter(spark);
		
		report.setSystemInfo("User", "Shiva");
		report.setSystemInfo("Browser","chrome");
		report.setSystemInfo("OS","Windows11");
		
		spark.config().setDocumentTitle(" Assert ");
		spark.config().setReportName("Assert VAlidation WITH tITLE");
	}
	
	@Test
	public void run() 
	{
		sa=new SoftAssert();
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(op);
		test=report.createTest("URL has been opend");
		driver.get("https://www.saucedemo.com/");
		test=report.createTest("UserName entred");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		test=report.createTest("Password entred");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		test=report.createTest("Entered ");
		driver.findElement(By.id("login-button")).click();
	}
	
	@Test
	public void veriftTitle()
	{
		
		String expected="Swag Labs";
		String title=driver.getTitle();
		test=report.createTest("Validation..");
		sa.assertEquals(expected, title);
		sa.assertAll();
	}
	
	@BeforeMethod
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
		driver.close();
	}
}