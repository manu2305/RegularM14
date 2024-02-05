package PopUP;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWindowHandle {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//explicit wait
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    //enter into page
	driver.get("https://demowebshop.tricentis.com/");
	//getting the DWS Handle
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	Actions a = new Actions(driver);
	//Scroll down the page for 2 Times
	a.keyDown(Keys.PAGE_DOWN).build().perform();
	a.keyDown(Keys.PAGE_DOWN).build().perform();
	WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
	Thread.sleep(1000);
	//wait for twitter to be visible 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Twitter']")));
	//opening the twitter page in different window
	a.moveToElement(twitter).keyDown(Keys.SHIFT).click().build().perform();
	//fetching, all the handles 
	Set<String> child = driver.getWindowHandles();
	//removing parent handle
	child.remove(parent);
	for (String str : child) {
		//switch my controller to the Twitter page
	driver.switchTo().window(str);
	}
	Thread.sleep(2000);
	//click the Not now button in the notification 
	driver.findElement(By.xpath("//span[text()='Not now']")).click();
	System.out.println("scipt is Successfull");
	//quit the browser
	driver.quit();
	
	
}
}
