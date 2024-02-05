package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day27MoveToElement {
public static void main(String[] args) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//providing implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into the myntra page
	driver.get("https://www.myntra.com/");
	WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
	//Actions action=new Actions(driver);
	Actions action = new Actions(driver);
	action.moveToElement(men).perform();
	driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();
	
	//   ctrl+\
}
}
