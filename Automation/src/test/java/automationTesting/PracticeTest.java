package automationTesting;

import org.testng.annotations.Test;

public class PracticeTest
{
	@Test(dependsOnMethods="test2")
	public void test()
	{
		System.out.println("1st method");
	}
	
	@Test(enabled=true)
	public void test2()
	{
		System.out.println("1st method");
	}
}