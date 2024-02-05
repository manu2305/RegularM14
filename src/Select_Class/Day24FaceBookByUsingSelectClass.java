package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day24FaceBookByUsingSelectClass {
public static void main(String[] args) throws InterruptedException {
	String userData="jmanikandan2305@gmail.com";
	String ph_no="7358001111";
	String email_id="jmanikandan2305@gmail.com";
	//open the Browser
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into faceBook Page
	driver.get("https://www.facebook.com/");
	//click the create Account
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(2000);
	WebElement sign_Up = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
	if(sign_Up.isDisplayed()) {
		System.out.println("Entering into sign_up page successfull");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Praveen");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Josh");
		if(Character.isDigit(userData.charAt(0))) {
			System.out.println("sign_Up by using mobile Number");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(ph_no);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Mantop2305");
			Thread.sleep(1000);
			WebElement day = driver.findElement(By.id("day"));
			Thread.sleep(1000);
			Select s1=new Select(day);
			Thread.sleep(1000);
		     s1.selectByVisibleText("23");
		     Thread.sleep(1000);
		    WebElement month = driver.findElement(By.id("month"));
		    Thread.sleep(1000);
		     Select s2=new Select(month);
		     Thread.sleep(1000);
		     s2.selectByIndex(4);
		     Thread.sleep(1000);
		     WebElement year = driver.findElement(By.id("year"));
		     Thread.sleep(1000);
		     Select s3=new Select(year);
		     Thread.sleep(1000);
		     s3.selectByVisibleText("2000");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		}
		else {
			System.out.println("Sign_Up by using Email_id");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email_id);
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email_id);
			driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Mantop2305");
			Thread.sleep(1000);
			WebElement day = driver.findElement(By.id("day"));
			Thread.sleep(1000);
			Select s1=new Select(day);
			Thread.sleep(1000);
		     s1.selectByVisibleText("23");
		     Thread.sleep(1000);
		    WebElement month = driver.findElement(By.id("month"));
		    Thread.sleep(1000);
		     Select s2=new Select(month);
		     Thread.sleep(1000);
		     s2.selectByIndex(4);
		     Thread.sleep(1000);
		     WebElement year = driver.findElement(By.id("year"));
		     Thread.sleep(1000);
		     Select s3=new Select(year);
		     Thread.sleep(1000);
		     s3.selectByVisibleText("2000");
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		     Thread.sleep(1000);
		     driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		}
		
	}
	else {
		System.out.println("Entering into sign_up page Unsuccessfull");
		driver.close();
	}
	
}
}
