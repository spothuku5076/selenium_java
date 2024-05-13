/**
 * 
 */
package selenium_rs.Synchronization_Waits;

import java.util.concurrent.TimeUnit;

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
public class GreenCartAutomation {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] itemsNeeded = {"Cucumber", "Carrot", "Beans","Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		for(int i=0;i<itemsNeeded.length;i++)
		{
			String item = itemsNeeded[i] + " - 1 Kg";
			//Thread.sleep(2000);
			addElement(driver,item);
		}
		String itemsCollectedXpath = "//td[text()='Items']/following-sibling::td[2]/strong";
		String itemsCollected = driver.findElement(By.xpath(itemsCollectedXpath)).getText();
		int itemsCollectedToCart =Integer.parseInt(itemsCollected);  
		Assert.assertEquals(itemsNeeded.length, (itemsCollectedToCart));
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		String promoApplied = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		Assert.assertEquals(promoApplied, "Code applied ..!");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		String dropDownxpath = "//label[text()='Choose Country']/following-sibling::div[1]/select";
		WebElement dropDownCheckout = driver.findElement(By.xpath(dropDownxpath));
		Select dropdown = new Select(dropDownCheckout);
		dropdown.selectByVisibleText("India");
		driver.findElement(By.cssSelector("input[class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.close();
		
		

	}
	
	public static void addElement(WebDriver driver, String item)
	{
		String elementXpath = "//h4[text()='Cucumber - 1 Kg']/following-sibling::div[2]/button";
		elementXpath = elementXpath.replaceAll("Cucumber - 1 Kg", item);
		driver.findElement(By.xpath(elementXpath)).click();
	}

}
