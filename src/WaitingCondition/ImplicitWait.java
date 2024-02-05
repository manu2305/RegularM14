package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into the faceBook
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
	//find  the Element for click create new Account
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	//pass some value inside the firstName
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("manikandan");

}
}
