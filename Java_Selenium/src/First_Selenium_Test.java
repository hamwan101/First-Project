import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Selenium_Test {

	@Test //J unit annotation. It is a test runner and view test results
	public void Test()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); //object command for locating browser.
	
	WebDriver driver = new ChromeDriver(); // Object that enables to open the browser.
	
	driver.get("http://www.qtptutorial.net/automation-practice/");//"get function" helps us to get URL.
	
	driver.findElement(By.id("idExample")).click();// 30 minutes. Identifies the ID element and clicks it
}
}
