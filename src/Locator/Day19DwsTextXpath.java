package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19DwsTextXpath {
public static void main(String[] args) throws InterruptedException {
	//open our browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into dws page
	driver.get("https://demowebshop.tricentis.com/");
	//click that digital download Page right
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[contains(text(),'Digital downloads')])[1]")).click();
	Thread.sleep(2000);
	 WebElement register_text = driver.findElement(By.xpath("//a[@class='ico-register']"));
	System.out.println(register_text.getText());
	driver.close();
}
}
