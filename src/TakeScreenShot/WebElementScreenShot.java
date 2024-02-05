package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenShot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter into DWS page
		LocalDateTime time = LocalDateTime.now();
		String date = time.toString().replace(":", "-");
		driver.navigate().to("https://demowebshop.tricentis.com/");
		WebElement logo = driver.findElement(By.className("header"));
		File from = logo.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\QSP1\\Pictures\\Screenshots\\"+date+".png");
		FileHandler.copy(from, to);
	}
}
