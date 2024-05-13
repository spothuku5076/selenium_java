package s16_testng_framework_1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo()
	{
		System.out.println("hello, welcome to testng class");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is after suite");
	}
}
