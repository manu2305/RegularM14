package PopUP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
public static void main(String[] args) {
	String given_text="Hello Manikanda How are you today";
	//open the Browser
		WebDriver driver=new ChromeDriver();
		//maximize 
		driver.manage().window().maximize();
		//enter into DWS page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		 Alert a = driver.switchTo().alert();
		 a.sendKeys("Manikanda");
		 a.accept();
		 String current_text = driver.findElement(By.id("demo1")).getText();
		 if(given_text.contains(current_text)) {
			 System.out.println("you have succesfully entered the data inside the pop-Up");
			 System.out.println(current_text);
			 driver.close();
		 }
		 else {
			 System.out.println("Data Is Successfull");
			 driver.close();
		 }
		
}
}
