package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
public static void main(String[] args) {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//enter into a DemoWebShop
	driver.get("https://demowebshop.tricentis.com/");
	//diven_title 
	String given_title="Demo Web Shop";
	//Current Title
	String Current_title=driver.getTitle();
	//Verify Given title and Current title
	if(given_title.equals(Current_title)) {
		System.out.println("the given and current title is Same");
	}
	else
		System.out.println("the given and current title is not same");
	driver.close();
	
	
	

	
}
}
