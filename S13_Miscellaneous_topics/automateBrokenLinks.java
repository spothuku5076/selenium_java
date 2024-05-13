/**
 * 
 */
package S13_Miscellaneous_topics;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * @author User
 *
 */
public class automateBrokenLinks {

	private static final String HttpURLConnection = null;

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		HttpsURLConnection conn = (HttpsURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int unbroken = conn.getResponseCode();
		Assert.assertEquals(200, unbroken);
		String brokenUrl = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		HttpsURLConnection brokenConn = (HttpsURLConnection) new URL(brokenUrl).openConnection();
		brokenConn.setRequestMethod("HEAD");
		brokenConn.connect();
		int broken = brokenConn.getResponseCode();
		Assert.assertEquals(404, broken);
		driver.close();

	}

}
