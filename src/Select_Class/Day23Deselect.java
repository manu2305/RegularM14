package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day23Deselect {
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
		s_ref.selectByIndex(1);
		Thread.sleep(1000);
		s_ref.deselectByIndex(1);
}
}
