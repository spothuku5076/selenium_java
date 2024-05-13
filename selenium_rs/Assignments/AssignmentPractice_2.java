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
public class AssignmentPractice_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Sai Lalitesh Pothukuchi");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("zibriskeh");
		driver.findElement(By.id("exampleCheck1")).click();
		boolean checkBoxisSelected = driver.findElement(By.id("exampleCheck1")).isSelected();
		Assert.assertTrue(checkBoxisSelected);
		WebElement staticDropDown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropDown);
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.xpath("//label[text()='Employed']")).click();
		driver.findElement(By.name("bday")).sendKeys("01/01/1991");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		String successMsg = driver.findElement(By.xpath("//strong[text()='Success!']/preceding-sibling::a/parent::div")).getText();
		System.out.println(successMsg);
		
		
		

	}

}
