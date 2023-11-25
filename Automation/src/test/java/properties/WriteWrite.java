package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteWrite 
{
	public static void main(String[] args) throws IOException 
	{
		Properties pro=null;
		FileOutputStream fo=null;
		try
		{
			String path="C:\\Users\\MWCL\\eclipse-workspace\\Automation\\src\\test\\java\\properties\\Write.properties";
			fo=new FileOutputStream(path);
			pro=new Properties();
			pro.setProperty("phone","8765789087");
			pro.setProperty("location","Banglore");
			pro.store(fo, "This is details");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			fo.close();
		}
	}
}