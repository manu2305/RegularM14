package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
public static void main(String[] args) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	driver.get("https://skillrary.com/");
//	WebElement learn_more = driver.findElement(By.xpath("//a[text()=' LEARN MORE']"));
//	driver.findElement(By.className("close_cookies")).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView(false);",learn_more);
	driver.get("https://demowebshop.tricentis.com/");
	//WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	//js.executeScript("arguments[0].scrollIntoView(false);", facebook);
	WebElement laptop14 = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
	js.executeScript("arguments[0].scrollIntoView(true);", laptop14);
}
}
