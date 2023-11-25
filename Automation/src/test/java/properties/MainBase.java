package properties;

import java.io.IOException;

public class MainBase extends BaseClass
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println(pro.getProperty("Name"));
		System.out.println(pro.getProperty("Phone"));
		System.out.println(pro.getProperty("Location"));
		System.out.println(pro.getProperty("City"));
	}
}