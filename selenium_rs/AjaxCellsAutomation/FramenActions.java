/**
 * 
 */
package selenium_rs.AjaxCellsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author User
 *
 */
public class FramenActions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryui.com/droppable");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		actions.dragAndDrop(source, target).build().perform();
		/* Brings the control back to the normal default page */
		driver.switchTo().defaultContent();
		driver.close();

	}

}