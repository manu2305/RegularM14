package Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day22SingleSelect {
public static void main(String[] args) throws InterruptedException {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into Single Select Demo Page
	driver.get("file:///C:/Users/QSP1/Downloads/demo.html");
	//find the WebElement of an DropDown Menu
	Thread.sleep(2000);
	WebElement single_Select = driver.findElement(By.cssSelector("select[id='standard_cars']"));
	Thread.sleep(2000);
	Select s_ref = new Select(single_Select);
	Thread.sleep(2000);
	s_ref.selectByVisibleText("Mercedes");
	Thread.sleep(1000);
	s_ref.deselectByVisibleText("Mercedes");
//	s_ref.selectByValue("hda");
//	Thread.sleep(2000);
//	s_ref.selectByIndex(9);
//	Thread.sleep(2000);
//	List<WebElement> options = s_ref.getOptions();
//	for (WebElement web : options) {
//		web.click();
//		Thread.sleep(1000);
//	}
	//driver.close();
}
}
