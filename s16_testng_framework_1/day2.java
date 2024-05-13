package s16_testng_framework_1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void firstTestCase()
	{
		System.out.println("This is a first test case");
	}
	@Test
	public void secondTestCase()
	{
		System.out.println("This is a second Test case");
	}
	
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("deleting the database application");
		System.out.println("performing cleaning activities");
	}
	
	@AfterTest
	public void deleteCookies()
	{
		System.out.println("After test for deleting cookies");
	}
}
