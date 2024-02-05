package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19Assignment {
public static void main(String[] args) throws InterruptedException {
	String given_Text="Featured products";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	WebElement featured_product = driver.findElement(By.xpath("//strong[text()='Featured products']"));
	String current_text = featured_product.getText();
	System.out.println(current_text);
	if(given_Text.equalsIgnoreCase(current_text)) {
		System.out.println("entering into the DWS page successfull");
		Thread.sleep(1000);
		List<WebElement> products = driver.findElements(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li/a"));
		Thread.sleep(1000);
		for (int i = 0; i <products.size(); i++) {
			String text = products.get(i).getText();
			Thread.sleep(1000);
			System.out.println(text);
			
		}
		driver.close();
	}
	else
		System.out.println("entering into the DWS page Unsuccessfull");
	
}
}
