/**
 * 
 */
package selenium_rs.AjaxCellsAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author User
 *
 */
public class actionsDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement signInhover = driver.findElement(By.xpath("//span[text()='Login']"));
		actions.moveToElement(signInhover).build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//input[@class='Pke_EE']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().perform();
		//driver.close();

	}

}
