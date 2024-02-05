package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12Login {
public static void main(String[] args) throws InterruptedException {
	String given_Url="https://demowebshop.tricentis.com/";
	String given_loginTitle="Demo Web Shop. Login";
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	String Current_Url=driver.getCurrentUrl();
	if(given_Url.equals(Current_Url)) {
		System.out.println("You are in DemoWebShop page");
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		String Current_loginTitle=driver.getTitle();
		if(given_loginTitle.contains(Current_loginTitle)) {
			System.out.println("you are in Login page");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#Email")).sendKeys("admin02@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Admin02");
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("input[id='RememberMe']")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".button-1.login-button")).click();
			Thread.sleep(1000);
			driver.close();
		}
		else
			System.out.println("You are not in Login Page");
		
	}
	else
		System.out.println("you are in demoWebShop Page");
	
}
}
