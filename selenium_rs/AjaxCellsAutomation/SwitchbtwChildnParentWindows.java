/**
 * 
 */
package selenium_rs.AjaxCellsAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Sai Lalitesh Pothukuchi
 *
 */
public class SwitchbtwChildnParentWindows {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
	    Iterator<String> it =  windows.iterator();
	    String parentWindow = it.next();
	    String childWindow = it.next();
	    driver.switchTo().window(childWindow);
	    String userNameExtract = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
	    String userNameSplit[] = userNameExtract.split("@");
	    String userNameLast = userNameSplit[1].split(" ")[0];
	    String userNameFirst = userNameSplit[0].split(" ")[4];
	    String userName = userNameFirst+"@"+userNameLast;
	    driver.switchTo().window(parentWindow);
	    driver.findElement(By.cssSelector("input#username")).click();
	    driver.findElement(By.cssSelector("input#username")).sendKeys(userName);

	}

}
