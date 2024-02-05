package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByAndTo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	//enter into DWS page
	driver.navigate().to("https://skillrary.com/");
	JavascriptExecutor je=(JavascriptExecutor) driver;
//	je.executeScript("window.scrollBy(0,1000);");
//	Thread.sleep(2000);
//	je.executeScript("window.scrollBy(0,-1000);");
	je.executeScript("window.scrollTo(0,1000);");
	Thread.sleep(2000);
	je.executeScript("window.scrollTo(0,-1000);");
}
}
