import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boot_strap{ 
@Test
public void bootstrap() throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe"); //object command for locating browser.

WebDriver driver = new ChromeDriver(); // Object that enables to open the browser.

driver.manage().window().maximize();

driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");


driver.findElement(By.xpath(".//*[@id='menu1']")).click();

Thread.sleep(2000);

List<WebElement>dd_menu=driver.findElements(By.xpath(".//*[@id='post-body-4615304122771162527']/div[1]/div/ul"));


for (int i=0; i<dd_menu.size();i++)
	
{ 
	WebElement element=dd_menu.get(i);

String innerhtml=element.getAttribute("innerHTML");

System.out.println(innerhtml);


//here we  will verify if link is equal to java script
if (element.getAttribute("innerHTML").contains("JavaScript")) {
	//if yes then click on link(item)
	element.click();
	
	//break the loop of come out of loop
	break;
}



}

}
}







