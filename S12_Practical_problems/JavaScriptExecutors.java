/**
 * 
 */
package S12_Practical_problems;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

/**
 * @author User
 *
 */
public class JavaScriptExecutors {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws  
	 */
	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++)
		{
			int item = Integer.parseInt(values.get(i).getText());
			sum= sum+item;
		}
		String totalSumString = driver.findElement(By.cssSelector(".totalAmount")).getText();
		String totalSum = totalSumString.split(":")[1];
		totalSum = totalSum.strip();
		Assert.assertEquals(sum, Integer.parseInt(totalSum));
		driver.close();
		

	}

}
