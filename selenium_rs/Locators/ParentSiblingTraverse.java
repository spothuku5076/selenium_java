/**
 * 
 */
package selenium_rs.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author User
 *
 */
public class ParentSiblingTraverse {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/OneDrive/Desktop/Courses/Selenium_RS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String login = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		Assert.assertEquals(login, "Login");
		String practice= driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/preceding-sibling::button")).getText();
		Assert.assertEquals(practice, "Practice");
		
		
		driver.close();

	}

}
