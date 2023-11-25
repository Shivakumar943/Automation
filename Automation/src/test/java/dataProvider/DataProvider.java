package dataProvider;

import org.testng.annotations.Test;

public class DataProvider 
{
	@Test(dataProvider="getUserDetails")

	public void display(String name,int age, String city)
	{
		System.out.println(name+" "+age+" "+city);
	}
	
	@org.testng.annotations.DataProvider()
	public Object[][] getUserDetails()
	{
		return new Object[][]
				{
					{"shivakumar",87,"Gangatavati"},
					{"kuamr",45,"Banglore"},
					{"rahul",77,"Mysore"}
				};
	}
}