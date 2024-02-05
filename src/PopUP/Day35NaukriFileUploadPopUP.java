package PopUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day35NaukriFileUploadPopUP {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	ChromeDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into naukri
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.naukri.com/");
	Thread.sleep(2000);
	//click register button
	driver.findElement(By.id("register_Layer")).click();
	Actions act = new Actions(driver);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	act.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='resumeUpload']")).sendKeys("C:\\Users\\QSP1\\Desktop\\QCO-SOEJVD-M14\\Day-2.pdf");
	
}
}
