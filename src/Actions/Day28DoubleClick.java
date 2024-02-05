package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day28DoubleClick {
public static void main(String[] args) throws InterruptedException {
   //open the browser
	 WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into guru99 
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	//create Actions Class
	WebElement double_click = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	Actions a=new Actions(driver);
	a.doubleClick(double_click).build().perform();
	Thread.sleep(2000);
	try {
		double_click.isEnabled();
		System.out.println("my script is UnSuccessfull");
	} catch (Exception e) {
	
		System.out.println("my Script is successfull");
	}
}
}
