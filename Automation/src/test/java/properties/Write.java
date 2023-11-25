package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write {

	public static void main(String[] args) throws IOException {

		Properties pro=new Properties();
		FileOutputStream fo=new FileOutputStream("C:\\Users\\MWCL\\eclipse-workspace\\Automation\\src\\test\\java\\properties\\Write.properties");
		pro.setProperty("Name", "Shivakumar");
		pro.setProperty("City", "Dharawad");
		pro.setProperty("Location","Attiguppe");
		pro.store(fo,"Customers data store");
	}
} 