package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream11 {
public static void main(String[] args) {
	ChromeOptions chrome_options = new ChromeOptions();
	chrome_options.addArguments("--disable-notifications");
	//open the browser
	ChromeDriver driver = new ChromeDriver(chrome_options);
	//maximize 
	driver.manage().window().maximize();
	//implicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
	//enter into the browser
	driver.get("https://www.dream11.com/");
	//driver.switchTo().frame(0);
	//driver.switchTo().frame("send-sms-iframe");
	WebElement iframe = driver.findElement(By.className("send-sms-iframe"));
	//switch my controller to embedded page
	driver.switchTo().frame(iframe);
	driver.findElement(By.id("regEmail")).sendKeys("7358001111");
	//switch my controller to parent page
	driver.switchTo().defaultContent();
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='hamburger']")));
	driver.findElement(By.xpath("//div[@id='hamburger']")).click();
	
}
}
