package s16_testng_framework_1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is before method");
	}
	
	@Test
	public void testLogin()
	{
		System.out.println("This is test LOgin");
	}
	@Test
	public void testLogins()
	{
		System.out.println("This is test LOgin-2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is after method");
	}

}
