package PopUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusAssignment {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions chrome_options = new ChromeOptions();
	chrome_options.addArguments("--disable-notifications");
	//open the browser
	ChromeDriver driver = new ChromeDriver(chrome_options);
	//maximize 
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	//enter into the browser
	driver.get("https://www.redbus.in/");
	Actions act = new Actions(driver);
	driver.findElement(By.id("src")).sendKeys("Bangalore");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Bangalore']")));
	act.keyDown(Keys.ENTER).build().perform();
	driver.findElement(By.id("dest")).sendKeys("Chennai");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Chennai']")));
	act.keyDown(Keys.ENTER).build().perform();
	driver.findElement(By.cssSelector("div[class='labelCalendarContainer']")).click();
	driver.findElement(By.xpath("//span[text()='20']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("search_button")).click();
	
	
}
}
