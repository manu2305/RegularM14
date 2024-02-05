package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStackbasic {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.shoppersstack.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
}
}
