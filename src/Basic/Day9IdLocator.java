package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9IdLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("small-searchterms")).sendKeys("Books");
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.quit();	
}
}
