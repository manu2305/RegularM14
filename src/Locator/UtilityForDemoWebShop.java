package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UtilityForDemoWebShop {
	public static WebDriver driver;
	public static void ChromeBrowser() {
		 driver=new ChromeDriver();//reinitialize 
		 driver.manage().window().maximize();
	}
	public static void EdgeBrowser() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
	}
	public static void FireFoxBrowser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	public static void CloseBrowser() {
		driver.close();
	}
	public static void openDWS() {
		driver.get("https://demowebshop.tricentis.com/");//test Script
	}
	public static void main(String[] args) {
		ChromeBrowser();//pre-condition
		openDWS();//Test Script
		CloseBrowser();//post-condition
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
