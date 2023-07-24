package testng.test;

import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void user1SignIn()
	{
		System.out.println("user1SignIn from 1st Test");
	}
	
	
	@Test(dependsOnMethods = {"user1SignIn"})
	public void user1Login()
	{
		System.out.println("user1Login from 1st test");
	}
	
}
