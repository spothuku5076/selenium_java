/**
 * 
 */
package selenium_rs.DropDownsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * @author Sai Lalitesh Pothukuchi
 *
 */
public class StaticDropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropDown );
		dropdown.selectByIndex(3);
		String USD = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(USD, "USD");
		
		dropdown.selectByVisibleText("INR");
		String INR = dropdown.getFirstSelectedOption().getText();
		Assert.assertEquals(INR, "INR");

	}

}
