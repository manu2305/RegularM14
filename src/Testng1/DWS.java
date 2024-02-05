package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS {
@Test
public void dws() {
//	WebDriver driver=new ChromeDriver();
//	//maximize the Browser
//	driver.manage().window().maximize();
//	//implicit wait
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//	//enter into DWS page
//	driver.get("https://demowebshop.tricentis.com/");
//	driver.quit();
	Reporter.log("dws",true);
}
@Test
public void test1() {
	System.out.println("hi iam from test1");
}
@Test
public void cat() {
	System.out.println("hi iam from cat");
}

}
