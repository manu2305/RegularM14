package PopUP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertActionsAssignment {
public static void main(String[] args) throws InterruptedException {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into the browser
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
//    Actions a = new Actions(driver);
//    Thread.sleep(2000);
//    a.moveToElement(right_click).contextClick(right_click).build().perform();
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//span[text()='Edit']")).click();
//    Thread.sleep(2000);
//    Alert al = driver.switchTo().alert();
//    Thread.sleep(2000);
//    al.accept();
	List<WebElement> Content_insideBox = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
	for (WebElement web : Content_insideBox) {
		System.out.println(web.getText());
		Actions a = new Actions(driver);
		a.moveToElement(right_click).contextClick(right_click).build().perform();
		Thread.sleep(1000);
		web.click();
		Thread.sleep(1000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(al.getText());
		al.dismiss();	
		Thread.sleep(1000);
	}
    
    
}
}
