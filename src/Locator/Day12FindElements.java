package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12FindElements {
public static void main(String[] args) throws InterruptedException {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//Maximize the Browser
	driver.manage().window().maximize();
	//enter into DemoWebShop Page
	driver.get("https://demowebshop.tricentis.com/");
	  List<WebElement> community_pool = driver.findElements(By.cssSelector("input[type='radio']"));
	 System.out.println(community_pool);
	 for (WebElement web : community_pool) {
		web.click();
		Thread.sleep(2000);
	}
	 driver.close();

}
}
