package PopUP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day35CalenderPopUp {
public static void main(String[] args) {
	//open the browser
		ChromeDriver driver=new ChromeDriver();
		//maximize the Browser
		driver.manage().window().maximize();
		//enter into naukri
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://www.agoda.com/");
		WebElement no_thanks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks']")));
		no_thanks.click();
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-01-20']")).click();
		driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
		driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
		WebElement next_month = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
		try {
			driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']")).click();
			System.out.println("Script is successfull ");
		} catch (Exception e) {
			next_month.click();
		}
		
		
}
}
