/**
 * 
 */
package selenium_rs.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * @author User
 *
 */
public class AssignmentPractice6 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		String optionSelected = driver.findElement(By.xpath("//input[@id = 'checkBoxOption2']/parent::label")).getText();
		WebElement selectDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(selectDropdown);
		dropdown.selectByVisibleText(optionSelected);
		driver.findElement(By.xpath("//input[@name='enter-name']")).click();
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(optionSelected);
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String getOptionFromAlert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String Splitter = getOptionFromAlert.split(",")[0];
		String option = Splitter.split(" ")[1];
		Assert.assertEquals(option,optionSelected );
		driver.close();

	}

}
