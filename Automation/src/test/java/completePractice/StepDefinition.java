package completePractice;

import org.testng.Assert;

import cucumber.api.java.en.*;

public class StepDefinition extends Base
{
	PageLogin pl=new PageLogin(driver);
	
	@Given("^i url enter by me$")
	public void i_url_enter_by_me()
	{
		driver.get("https://www.saucedemo.com/");
		test=er.createTest("URL has been entered");
	}
	
	@When ("^it should lands on login page$")
	public void it_should_lands_on_login_page()
	{
		pl.enterUserName("standard_user");
		test=er.createTest("User Name has been entered");
		
		pl.enterPassword("secret_sauce");
		test=er.createTest("Password has been entered");
	}
	
	@And ("^i entwr the user and password$")
	public void i_entwr_the_user_and_password()
	{
		pl.enterButton();
		test=er.createTest("Sumitted");
	}
	
	@Then("^it sow the home and verify the title here$")
	public void it_sow_the_home_and_verify_the_title_here()
	{
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals("Swag Labs",actualTitle);
		test=er.createTest("title varification has been done");
		
		er.flush();
		driver.close();
	}
}