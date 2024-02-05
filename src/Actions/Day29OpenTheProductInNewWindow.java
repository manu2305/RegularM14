package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day29OpenTheProductInNewWindow {
public static void main(String[] args) throws InterruptedException {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS
	driver.get("https://demowebshop.tricentis.com/");
	//find the targeted webElement 
	List<WebElement> Products = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));
	Actions a = new Actions(driver);
	for (WebElement web : Products) {
		a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
		Thread.sleep(2000);
	}
	driver.quit();
}
}
