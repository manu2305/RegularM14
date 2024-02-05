package WaitingCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.get("https://www.shoppersstack.com/");
    //click the login button
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	//check the login button
	WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
	login.click();
	//check the create account button
	WebElement create_account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create Account']")));
	create_account.click();	 
	driver.close();
}
}
