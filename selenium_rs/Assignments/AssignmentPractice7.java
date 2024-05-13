/**
 * 
 */
package selenium_rs.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Lalitesh
 *
 */
public class AssignmentPractice7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
		System.out.println(rows.size());
		List<WebElement> columns = driver.findElements(By.cssSelector(".table-display th"));
		System.out.println(columns.size());
		String secondRow = driver.findElements(By.cssSelector(".table-display tr:nth-child(3)")).get(0).getText();
		System.out.println(secondRow);
	}

}
