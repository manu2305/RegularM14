package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_Method {
public static void main(String[] args) throws InterruptedException {
	String id="small-searchterms";
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into DWS
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	WebElement search_field = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	Thread.sleep(2000);
	String attribute_value = search_field.getAttribute("id");
	Thread.sleep(2000);
	System.out.println(attribute_value);
	if(id.equals(attribute_value)) {
		System.out.println("our script is correct");
	}
	else {
		System.out.println("check the Script.......");
	}
	Thread.sleep(2000);
	driver.close();
}
}
