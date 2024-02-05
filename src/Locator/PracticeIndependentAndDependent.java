package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeIndependentAndDependent {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into Single Select Demo Page
	driver.get("https://demowebshop.tricentis.com/digital-downloads");
	//find the WebElement of an DropDown Menu
	Thread.sleep(2000);
	List<WebElement> price = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div[2]/div[3]/div/span"));
	for (WebElement web : price) {
		System.out.println(web.getText());
		Thread.sleep(1000);
	}
	driver.close();
}
}
