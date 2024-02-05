package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16XpathByAttribute {
public static void main(String[] args) {
	//open the browser 
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//enter into the DWS
	driver.navigate().to("https://demowebshop.tricentis.com/");
	//click the login link
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin02@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin02");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
}
}
