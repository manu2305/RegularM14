package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day29SendKeysDws {
public static void main(String[] args) {
	String given_Url="https://demowebshop.tricentis.com/";
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS WebPage
	driver.get("https://demowebshop.tricentis.com/");
	//verify the HomePage of DWS
	String current_Url=driver.getCurrentUrl();
	if(given_Url.equals(current_Url)) {
		System.out.println("you are in DWS page");
		WebElement search_field = driver.findElement(By.id("small-searchterms"));
		Actions a=new Actions(driver);
		if(search_field.isEnabled()) {
			System.out.println("search field is enabled");
			a.moveToElement(search_field).click().sendKeys("Manikanda").build().perform();
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			System.out.println("script is Successfull");
			driver.close();
		}
		else {
			System.out.println("Search field is not enabled");
		}
	}
	else
	{
		System.out.println("you are not in DWS page");
		System.out.println("Script is Unsuccessfull");
		driver.close();
	}
	
	
}
}
