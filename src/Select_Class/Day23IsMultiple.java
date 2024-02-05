package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23IsMultiple {
public static void main(String[] args) throws InterruptedException {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into demo page
	driver.get("file:///C:/Users/QSP1/Downloads/demo.html");
	//store the webElement of DropDown Menu
	WebElement single_dropDown = driver.findElement(By.xpath("//select[@id='standard_cars']"));
	WebElement multi_dropDown = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
	Select s1=new Select(single_dropDown);
	Select s2=new Select(multi_dropDown);
	if(s1.isMultiple()) {
		System.out.println("you are using S1 Drop Down Menu");
		Thread.sleep(1000);
		List<WebElement> s1_values = s1.getOptions();
		Thread.sleep(1000);
		for (WebElement web : s1_values) {
			web.click();
			Thread.sleep(1000);
		}
		s1.deselectAll();
	}
	else {
		System.out.println("you are in S2 Drop Down Menu");
		Thread.sleep(1000);
		List<WebElement> s2_Values = s2.getOptions();
		for (WebElement web : s2_Values) {
			web.click();
			Thread.sleep(1000);
		}
		s2.deselectAll();
	}
	driver.close();
		
}
}
