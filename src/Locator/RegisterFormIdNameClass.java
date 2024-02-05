package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterFormIdNameClass {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();// upcasting 
	//enter into the demoWebShop page
	driver.get("https://demowebshop.tricentis.com/");
    //click the register button
	Thread.sleep(500);
	driver.findElement(By.className("ico-register")).click();
	Thread.sleep(500);
	driver.findElement(By.id("gender-female")).click();
	Thread.sleep(500);
	driver.findElement(By.id("FirstName")).sendKeys("jmani");
	Thread.sleep(500);
	driver.findElement(By.name("LastName")).sendKeys("m");
	Thread.sleep(500);
	driver.findElement(By.id("Email")).sendKeys("manu23051@gmail.com");
	Thread.sleep(500);
	driver.findElement(By.name("Password")).sendKeys("manu2305123");
	Thread.sleep(500);
	driver.findElement(By.id("ConfirmPassword")).sendKeys("manu2305123");
	Thread.sleep(500);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(500);
	WebElement Getting_text = driver.findElement(By.cssSelector("div[class='validation-summary-errors']"));
	Thread.sleep(500);
	System.out.println(Getting_text.getText());
	
}
}
