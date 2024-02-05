package Testng1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartByChronologicalOrder {
	public   WebDriver driver;
@BeforeClass
public void openTheBrowser() {
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
}
@BeforeMethod(enabled = true)
public void login() {
	//driver.get("https://demowebshop.tricentis.com/");
      driver.findElement(By.className("ico-login")).click();
      driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
      driver.findElement(By.id("Password")).sendKeys("admin01");
      driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
}
@Test
public void addToCart() {
	System.out.println("successfull...............");
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
}
@AfterMethod(enabled = true)
public void logOut() {
	driver.findElement(By.className("ico-logout")).click();
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}
}
