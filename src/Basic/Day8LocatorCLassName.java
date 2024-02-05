package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8LocatorCLassName {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//enter into the DemoWebShop
	driver.get("https://demowebshop.tricentis.com/");
	//click the Login Button
	Thread.sleep(2000);
	driver.findElement(By.className("ico-login")).click();
	
}
}
