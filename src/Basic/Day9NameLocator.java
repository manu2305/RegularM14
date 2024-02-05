package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9NameLocator {
public static void main(String[] args) throws InterruptedException {
	//open my browser
	WebDriver driver=new ChromeDriver();
	//maximize our browser
	driver.manage().window().maximize();
	//enter into webpage
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("mobile");
	Thread.sleep(2000);
	driver.close();
}
}
