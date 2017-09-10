package demo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dry_selenium {
	
	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); //object command for locating browser.
		
		WebDriver driver = new ChromeDriver(); // Object that enables to open the browser.
		
		driver.manage().window().maximize();
		
		driver.get("http://demosite.center/wordpress/wp-login.php?loggedout=true");	
		
		driver.findElement
		
	}

}
