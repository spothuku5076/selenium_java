/**
 * 
 */
package selenium_rs.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author Sai Lalitesh Pothukuchi
 *
 */
public class LocatorsPractice {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/User/OneDrive/Desktop/Courses/Selenium_RS/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("lalitesh");
		driver.findElement(By.name("inputPassword")).click();
		driver.findElement(By.name("inputPassword")).sendKeys("laliteshPothukuchi");
		driver.findElement(By.className("signInBtn")).click();
	
		
		/* css Selector --> tagname.classname --> if classname is used
		 * css Selector --> tagname#id--------> if id is used in building it
		 * css Selector --> tagname[attribute='Value'] ---> if classname and id are not there
		 *                       or you do not want to use them */
		//String errMessage = driver.findElement(By.cssSelector("p.error")).getText();
		//System.out.println(errMessage);
		
		/* To highlight an element in inspect section, go to console
		 * For CSS Selector give $ and write the css selector in single quotes inside ()
		 * ----> $('p.error')
		 * */
		
		
		/*The below line is using Link text, based on text we can identify element, but always
		  make sure that the tag for that html is a i.e, anchor tag */
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		
		/* traversing with parents and child when the form is parent and the child is h2 
		 * then we have to use //form/h2 ---> //parent/child 
		 * 
		 * In css---> parent child*/
		String pageHeading = driver.findElement(By.xpath("//form/h2")).getText();
		if (pageHeading.equalsIgnoreCase("forgot password"))
		{
			driver.findElement(By.xpath("//input[@placeholder='Name']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Lalit");
			
			/* We can also use the xpath //input[@type='text'], but we have 4 elements with that so 
			 * we have to use (//input[@type="text"])[2] to identify that element
			 * 
			 * for CSS Selector if we have multiple elements then, we have to use
			 * (input[type='text']:nth-child(2)).sendKeys
			 */
			driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
			driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("lalitheshp@gmail.com");
			
			driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
			//PasswordExtractor
			LocatorsPractice ls = new LocatorsPractice();
			String password = ls.passwordExtractor(driver);
			Thread.sleep(3000);
			/*
			 * Finding an element using regex--> css selectr --> (button[class*='go-to'])
			 *                               --> xpath ---> (button[contains(@class,'go-to')]))
			 * --> * represent the wild cards --> the letters present after the given text
			 */
			driver.findElement(By.cssSelector("button[class*='go-to']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("inputUsername")).click();
			driver.findElement(By.id("inputUsername")).sendKeys("lalitesh");
			
			driver.findElement(By.name("inputPassword")).click();
			driver.findElement(By.name("inputPassword")).sendKeys(password);
			driver.findElement(By.className("signInBtn")).click();
			Thread.sleep(3000);
			String welcomeMsg = driver.findElement(By.cssSelector("div[class='login-container'] p")).getText();
			//System.out.println(welcomeMsg);
			Assert.assertEquals(welcomeMsg, "You are successfully logged in.");
			
			/*
			 * Based on the text in a button
			 * xpath --> //button[text()='Text to find']--> //button[text()='Log Out']
			 * we can use //*[text()='Log Out']
			 * css--> no such method
			 */
			driver.findElement(By.xpath("//button[text()='Log Out']")).click();
			driver.quit();

		}
		else
		{
			driver.close();
		}
		
		

	}
	
	public String passwordExtractor(WebDriver driver)
	{
		String resetPwd = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		//System.out.println(resetPwd);
		String[] passwordSplit = resetPwd.split("'");
		String[] passwordExtract = passwordSplit[1].split("'");
		String password = passwordExtract[0];
		
		
		
		
		return password;
		
	}

}
