package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//enter into webpage by using navigate method
	driver.navigate().to("https://www.ktmindia.com/");
	//title of the page
	String Current_titleKtm=driver.getTitle();
	System.out.println(Current_titleKtm);
	//moving to royal enfield
	driver.get("https://www.royalenfield.com/");
	//moving KTm
	driver.navigate().back();
	String given_titleKtm="KTM | READY TO RACE | Explore the range in India – Models, Features, Price, Colors";
	
	if(given_titleKtm.contains(Current_titleKtm)) {
		System.out.println("you are in KTM WebPage");
	}
	else
		System.out.println("You are in RoyalEnfield webPage ");
	driver.navigate().forward();
	//ctrl+shift+i
	//ctrl+f
	
	
}
}
























