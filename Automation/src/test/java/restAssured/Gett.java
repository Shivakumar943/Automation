package restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Gett 
{
	@Test
	public void run()
	{
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecification rs=RestAssured.given();
		
		rs.header("Content-type","Application/json");
		Response response=rs.get();
		
		int i=response.getStatusCode();
		System.out.println("Code : " + i);
		
		Assert.assertEquals(i,200);
		System.out.println(response.asPrettyString());
		System.out.println("---------------");
		System.out.println(response.body().asString());
		
		JsonPath js=response.jsonPath();
		System.out.println("----- : " + js.toString());
	}
}