import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_dropdown {

@Test
public void facebook() {
	
System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); //object command for locating browser.
	
	WebDriver driver = new ChromeDriver(); // Object that enables to open the browser.
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	WebElement month =driver.findElement(By.id("month"));
	Select x= new Select (month);
	x.selectByVisibleText("Jan");
	
	WebElement date =driver.findElement(By.id("date"));
	Select y= new Select (date);
	y.selectByVisibleText("19");
	
	
}

}

	
	
	

