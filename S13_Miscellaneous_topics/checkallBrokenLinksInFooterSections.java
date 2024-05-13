/**
 * 
 */
package S13_Miscellaneous_topics;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

/**
 * @author User
 *
 */
public class checkallBrokenLinksInFooterSections {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		SoftAssert a = new SoftAssert();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		// footer_top_agile_w3ls gffoot footer_style
        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        List<WebElement> links = footerDriver.findElements(By.cssSelector("li[class='gf-li'] a"));
        for(WebElement link:links)
        {
        	String url = link.getAttribute("href");
        	HttpsURLConnection conn = (HttpsURLConnection)new URL(url).openConnection();
    		conn.setRequestMethod("HEAD");
    		conn.connect();
    		int unbroken = conn.getResponseCode();
    		a.assertTrue(unbroken>400, link.getText() + " is a broken link");
//    		if(unbroken > 400)
//    		{
//    			System.out.println(link.getText() + " is a broken link");
//    		}
//    		else
//    		{
//    			System.out.println("This "+ link.getText()+" works");
//    		}
    		
        }
        a.assertAll();
	}

}
