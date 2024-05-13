/**
 * 
 */
package selenium_rs.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sai Lalitesh Pothukuchi
 *
 */
public class SelIntroduction {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*Invoking Browser
		//ChromeDriver driver = new ChromeDriver(); --> Driver object has access to all 
		 * the methods of Chrome Driver (Only Chrome methods)
		 * 
		WebDriver driver = new ChromeDriver();--> Driver object has access to all the methods 
		of chrome Driver which are defined in web driver interface 
		(WebDriver methods + Chrome Driver methods)
		*/
		System.setProperty("webdriver.chrome.driver","C:/Users/User/OneDrive/Desktop/Courses/Selenium_RS/chromedriver.exe");
		/* The above line is very optional, if not driver is specified, Selenium Manager takes
		 * care of the version and execution
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		//get the current url of the window
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		//close the browser
		driver.close();
		
		/* driver.quit(); --> quits the browser
		 * The difference between close and quit is close just closes the current browser 
		 * that opened
		 * But quits closes all the windows that are associated with the broswer while automating
		 */
		
		

	}

}
