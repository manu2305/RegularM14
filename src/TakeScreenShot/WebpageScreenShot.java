package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class WebpageScreenShot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into DWS page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		LocalDateTime time = LocalDateTime.now();
		String date = time.toString().replace(':','-');
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);// steps for taking the Screen Shot;
		File to = new File("C:/Users/QSP1/Pictures/Screenshots/"+date+".png");
		FileHandler.copy(from, to);
		
	}
}
