package testng.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class GlobalValuesDerive {

	Properties prop;
	
	@Test
	public void getPropertiesData() throws IOException
	{
		prop = new Properties();
		FileInputStream fi = new FileInputStream("G:\\RestAssuredAPIsTesting\\"
				+ "RestAssuredWorkspace1\\TestNgProject\\src\\test\\resources\\data.properties");
		prop.load(fi);
		String site_ = prop.getProperty("site");
		System.out.println(site_);
		
		prop.setProperty("site", "localvalue");
		
		System.out.println(prop.getProperty("site"));
		
		FileOutputStream fo = new FileOutputStream("G:\\RestAssuredAPIsTesting\\"
				+ "RestAssuredWorkspace1\\TestNgProject\\src\\test\\resources\\data.properties");
		
		prop.store(fo, "something");
	}
	
	
}
