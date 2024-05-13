/**
 * 
 */
package S13_Miscellaneous_topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author User
 *
 */
public class miscellaneous {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximizes the window before url is loaded
		driver.manage().deleteAllCookies(); //deletes all the cookies
		driver.get("https://www.google.com");
		driver.close();

	}

}
