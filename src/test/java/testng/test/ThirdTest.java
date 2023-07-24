package testng.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest {

	@Test
	public void user3SignIn()
	{
		System.out.println("user3SignIn from 3rd test");
	}
	
	@Parameters({"url"})
	@Test
	public void user3Login(String urlname)
	{
		System.out.println("user3Login from 3rd test");
		System.out.println("url name is " + urlname);
	}
	
	@Test
	public void safeLogin()
	{
		System.out.println("safelogin from 3rd test");
	}
}
