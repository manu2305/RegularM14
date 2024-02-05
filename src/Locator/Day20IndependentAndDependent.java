package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day20IndependentAndDependent {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/digital-downloads");
	//get the text of the 14 inch laptop
	//WebElement web = driver.findElement(By.xpath("//span[contains(text(),'1590.00')]"));
	Thread.sleep(2000);
	WebElement web = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/parent::h2/parent::div/child::div[3]/child::div/child::span"));
	System.out.println(web.getText());
}
}
