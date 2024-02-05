package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10LinkedTextLocator {
public static void main(String[] args) {
	String given_url="https://demowebshop.tricentis.com/";
	String given_loginTitle="Demo Web Shop. Login";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//enter into a DemoWebPage
	driver.get("https://demowebshop.tricentis.com/");
	String current_url = driver.getCurrentUrl();
	if(given_url.equals(current_url)) {
		System.out.println("successfully entered");
		driver.findElement(By.linkText("Log in")).click();
		String currentLoginTitle = driver.getTitle();
		if(given_loginTitle.contains(currentLoginTitle)) {
			System.out.println("you are in Login page");
			driver.close();
		}
		else
			System.out.println("you are not in Login page");
	}
	else
		System.out.println("Unsuccessfull");
}
}
