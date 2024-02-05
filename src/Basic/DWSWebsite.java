package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWSWebsite {
public static void main(String[] args) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter in the particular webpage
	driver.get("https://demowebshop.tricentis.com/");
	//for Given data
	String given_data="https://demowebshop.tricentis.com/";
	//finding the Current URL of the webpage.
	String current_data = driver.getCurrentUrl();
	if(given_data.equals(current_data)) {
		System.out.println(" DemoWebShop Url is same ");
	}
	else
		System.out.println("DemoWebShop Url is Not same");
	//for close the Browser
	driver.close();
}
}
