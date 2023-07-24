package testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

	@Test(groups = {"smoke"})
	public void user2SignIn()
	{
		System.out.println("user2SignIn from 2nd test");
	}
	
	@Test(groups = {"smoke"})
	public void user2Login()
	{
		System.out.println("user2Login from 2nd test");
		//Assert.assertEquals(false, true);
	}
}
