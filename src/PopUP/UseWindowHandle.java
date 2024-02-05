package PopUP;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseWindowHandle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	String dws = driver.getWindowHandle();
	System.out.println(dws);
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Books')]"))).keyDown(Keys.SHIFT).click().build().perform();
	Set<String> child = driver.getWindowHandles();
	child.remove(dws);
	for (String str : child) {
		driver.switchTo().window(str);
	}
	driver.close();
}
}
