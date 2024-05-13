/**
 * 
 */
package selenium_rs.real_time_exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author User
 *
 */
public class CalenderUiAutomation {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String date = "13";
		String month = "10";
		String year = "2024";
		String[] expectedDateList = {month,date,year};
		driver.findElement(By.cssSelector(".react-date-picker__clear-button__icon")).click();
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		String dateXpath = "//abbr[text()='13']";
		dateXpath = dateXpath.replaceAll("13", date);
		driver.findElement(By.xpath(dateXpath)).click();
		Thread.sleep(2000);
		List<WebElement> dateList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<dateList.size();i++)
		{
			String dateElement = dateList.get(i).getAttribute("value");
			Assert.assertEquals(dateElement, expectedDateList[i]);
		}
		
		driver.close();

	}

}
