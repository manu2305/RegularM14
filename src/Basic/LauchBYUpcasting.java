package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBYUpcasting {
public static void main(String[] args) {
	String s="https://www.qspiders.com/";//given URL
	//open our Chrome Browser
	WebDriver driver=new ChromeDriver();
	//maximize The Browser
	driver.manage().window().maximize();
	//enter into WebSite
	driver.get("https://www.qspiders.com/");
	//storing the Current URL
	String s1=driver.getCurrentUrl();// current URL//https.www.......
	//Verifying the Given and Current URL
	if(s.equals(s1)) {
		System.out.println("Url is same");
	}
	else
		System.out.println("Url is not same");
	driver.close();
}
}
