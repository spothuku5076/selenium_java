/**
 * 
 */
package selenium_rs.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Sai Lalitesh
 *
 */
public class BrowserNavigations {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//String googleSearch = driver.findElement(By.cssSelector("input[value='Google Search']")).getText();
		//Assert.assertEquals(googleSearch, "Google Search");
		Thread.sleep(6000);
		driver.navigate().to("https://www.uipath.com");
		String uiPath = driver.findElement(By.xpath("//span[text()='Try UiPath Free']")).getText();
		Assert.assertEquals(uiPath, "Try UiPath Free");
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(6000);
		driver.navigate().forward();
		driver.quit();

	}

}
