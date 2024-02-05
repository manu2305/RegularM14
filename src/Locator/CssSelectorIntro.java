package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorIntro {
public static void main(String[] args) throws InterruptedException {
	// open the Browser
	WebDriver driver=new ChromeDriver();
	//enter into the demoWebShop Page
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	//enter a Value inside search text field
	driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Mobile");
	//Click the Search Button
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
}
}
