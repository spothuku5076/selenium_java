/**
 * 
 */
package selenium_rs.DropDownsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author User
 *
 */
public class DropdownPracticeSpicejet {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		DropdownPracticeSpicejet ddp = new DropdownPracticeSpicejet();
		ddp.selectTripType(driver, "ow");
		ddp.selectRadioButtons(driver, "Senior Citizen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Welcome aboard']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		for (int i = 0; i <= 4; i++) {
			ddp.addAdult(driver);
		}

		ddp.addInfant(driver);
		ddp.selectOrigin(driver, "MAA");
		ddp.selectDestination(driver, "BLR");
		// ddp.departureDate(driver, "Tue, 2 Apr 2024");
		driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-27']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

	}

	public void addAdult(WebDriver driver) {
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	}

	public void addInfant(WebDriver driver) {
		driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']")).click();
	}

	public void selectOrigin(WebDriver driver, String Origin) throws InterruptedException {
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class = 'css-1dbjc4n']/preceding-sibling ::input")).sendKeys(Origin);
	}

	public void selectDestination(WebDriver driver, String destination) throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class = 'css-1dbjc4n']/preceding-sibling ::input)[2]"))
				.sendKeys(destination);
	}

	public void selectRadioButtons(WebDriver driver, String category) {
		String radioButtonxpath = "//div[text() ='Students']/parent::div/preceding-sibling::div";
		radioButtonxpath = radioButtonxpath.replaceAll("Students", category);
		boolean radioIsSelected = driver.findElement(By.xpath(radioButtonxpath)).isSelected();
		Assert.assertFalse(radioIsSelected);
		driver.findElement(By.xpath(radioButtonxpath)).click();
		// Assert.assertFalse(radioIsSelected);
	}

	public void departureDate(WebDriver driver, String date) {
		driver.findElement(By.xpath("//div[Text()='Departure Date']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//div[Text()='Departure Date']/preceding-sibling::div")).sendKeys(date);
	}

	public void selectTripType(WebDriver driver, String triptype) {
		if (triptype.equalsIgnoreCase("OW")) {
			driver.findElement(By.xpath("//div[@data-testid='one-way-radio-button']/div")).click();
			String styleAttribute = driver
					.findElement(By.xpath("//div[@data-testid = 'return-date-dropdown-label-test-id']/div"))
					.getAttribute("style");
			if (!styleAttribute.contains("opacity")) {
				Assert.assertTrue(true);
			}
		} else if (triptype.equalsIgnoreCase("RT")) {
			driver.findElement(By.xpath("//div[@data-testid='round-trip-radio-button']/div")).click();
		}

	}

	public void selectCurrentDate(WebDriver driver) {

	}

}
