/**
 * 
 */
package selenium_rs.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author User
 *
 */
public class AssignmentPractice5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		String middleText=driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		Assert.assertEquals(middleText, "MIDDLE");
		driver.close();
		

	}

}
