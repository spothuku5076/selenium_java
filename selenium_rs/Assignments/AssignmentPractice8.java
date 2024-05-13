/**
 * 
 */
package selenium_rs.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author User
 *
 */
public class AssignmentPractice8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("ind");
		List<WebElement> countries = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		for(WebElement country:countries) {
			//String countryName = country.getText();
			System.out.println(country.getText().equalsIgnoreCase("india"));
			country.click();

		}

	}

}
