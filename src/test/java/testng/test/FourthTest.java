package testng.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FourthTest {

	@Test(dataProvider = "getData")
	public void SignInForm(String username, String password)
	{
		System.out.println("username of user from fourthtest is   " + username );
		System.out.println("password of user from fourthtest is   " + password);
	}
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data = new String[3][2];
		
		data[0][0] = "Joseph";
		data[0][1] = "Leyman";
		
		data[1][0] = "Steve";
		data[1][1] = "smith";
        
		data[2][0] = "Carlson";
		data[2][1] = "Lome";
		return data;
	}
}
