/**
 * 
 */
package selenium_rs.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author User
 *
 */
public class Selenium_introduction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Invoking the driver from local machine */
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\OneDrive\\Desktop\\Selenium_RS\\chromedriver.exe");
		// Invoke Chrome Driver by creating the driver object
		/*
		 * ChromeDriver driver = new ChromeDriver();--> This line will have knowledge
		 * about the chrome drivers. So making sure it has knowledge above driver
		 * methods as well as class methods, we need to write a line to invoke both
		 * methods.
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		System.out.println(driver.getTitle());

	}

}
