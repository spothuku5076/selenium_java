/**
 * 
 */
package selenium_rs.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Sai Lalitesh Pothukuchi
 *
 */
public class AssignmentPractice_1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(3000);
		boolean checkbox1IsSelected = driver.findElement(By.id("checkBoxOption1")).isSelected();
		Assert.assertTrue(checkbox1IsSelected);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(checkbox1IsSelected);
		
		//System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		int noOfCheckboxes =driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		Assert.assertEquals(noOfCheckboxes, 3);
		driver.close();
		

	}

}
