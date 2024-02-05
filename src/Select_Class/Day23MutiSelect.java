package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23MutiSelect {
public static void main(String[] args) throws InterruptedException {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into demo page
	driver.navigate().to("file:///C:/Users/QSP1/Downloads/demo.html");
	//store the drop menu 
	WebElement multiDropDown = driver.findElement(By.id("multiple_cars"));
	//create a object Select Class
	Select s_ref = new Select(multiDropDown);
	List<WebElement> web = s_ref.getOptions();
	for (WebElement a : web) {
		a.click();
		Thread.sleep(1000);
	}
	Thread.sleep(2000);
	s_ref.deselectAll();
	
	
}
}
