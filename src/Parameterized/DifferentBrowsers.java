package Parameterized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowsers {
	WebDriver driver;
@Parameters("Driver")
@Test(groups = "smoke")
public void browsers(String div,String url) {
	if(div.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		driver.get(url);
		System.out.println("hi iam from ChromeDriver");
		Reporter.log("chromedriver");
	}
	else if (div.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
		System.out.println("hi iam from EdgeDriver");
		Reporter.log("edgedriver");
	}
	else if (div.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
		System.out.println("hi iam from FireFoxDriver");
		Reporter.log("firefoxdriver");
	}
	else
		System.out.println("driver is not found");
	}	
}

