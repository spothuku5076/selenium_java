/**
 * 
 */
package selenium_rs.Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * @author User
 *
 */
public class AssignmentPractice_3 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Student");
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		List<WebElement> addElements = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(WebElement addElement : addElements)
		{
			addElement.click();
		}
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		driver.findElement(By.id("country")).sendKeys("United States");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='suggestions']/ul/li"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("United States of America"))
			{
				option.click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		String successMsg =driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		Assert.assertEquals(successMsg, "Success! Thank you! Your order will be delivered in next few weeks :-).");

	}

}
