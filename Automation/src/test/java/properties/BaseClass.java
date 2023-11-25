package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass 
{
	public static Properties pro=null;
	public static FileInputStream fis=null;
	
	public void show() throws IOException
	{
		pro=new Properties();
		fis=new FileInputStream("C:\\Users\\MWCL\\eclipse-workspace\\Automation\\src\\test\\java\\properties\\Demo.properties");
		pro.load(fis);
	}
}