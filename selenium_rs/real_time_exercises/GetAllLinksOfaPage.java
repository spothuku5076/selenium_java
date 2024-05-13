/**
 * 
 */
package selenium_rs.real_time_exercises;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author User
 *
 */
public class GetAllLinksOfaPage {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://qaclickacademy.com/practice.php");
		int linksCount = driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links in entire page are "+linksCount);
		
		
		/*Limiting webDriver scope -- whatif I want to find out how many links are there in particular section
		 * In that case we can limit our webDriver scope to particular Section
		 * Create a webElement and assign it to an element using the xpath or css, so we can limit the webDriver Scope
		 * to particular section
		 */
		WebElement footerSectionDriver = driver.findElement(By.id("gf-BIG"));
		int sectionLinks = footerSectionDriver.findElements(By.tagName("a")).size();
		System.out.println("Number of Links in the footer Section are " +sectionLinks);
		
		WebElement columnDriver = footerSectionDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("Number of links present in first column of the footer section are " +columnDriver.findElements(By.tagName("a")).size());
		for(int i =0;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
//			driver.navigate().back();
			Thread.sleep(5000);
//			
			
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
