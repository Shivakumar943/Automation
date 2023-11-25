package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DemoRead 
{
	Properties prop;
	String path="C:\\Users\\MWCL\\eclipse-workspace\\Automation\\src\\test\\java\\properties\\Demo.properties";
	
	public DemoRead()
	{
		try 
		{
			prop=new Properties();
			FileInputStream fs=new FileInputStream(path);
			prop.load(fs);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public String name()
	{
		String na=prop.getProperty("name");
		return na;
	}
	
}