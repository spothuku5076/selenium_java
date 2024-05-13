package s16_testng_framework_1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * This class is for prioritizing test cases using testNg framework
 */
public class day3 {
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("This is for mobile login");	
	}
	
	@Test
	public void MobileLogOutCarLoan()
	{
		System.out.println("This is for mobile logout");	
	}
	
	@Test
	public void MobileLoginpersonlLoan()
	{
		System.out.println("This is for mobile login for personal Loan");	
	}
	
	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("This is for web login");
	}
	
	@Test
	public void APILoginCarLoan()
	{
		System.out.println("This is for API login");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is before test in day3");
	}

}
