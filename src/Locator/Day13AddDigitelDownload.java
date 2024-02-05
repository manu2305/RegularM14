package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13AddDigitelDownload {
public static void main(String[] args) throws InterruptedException {
	String given_url="https://demowebshop.tricentis.com/";
	String given_Digitel_download_Title="Demo Web Shop. Digital downloads";
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize my browser
	driver.manage().window().maximize();
	//enter into the demoWebPage
	driver.get("https://demowebshop.tricentis.com/");
	//enter into the Digitel download Page
	if(given_url.equals(driver.getCurrentUrl())) {
		System.out.println("you are in Demo Web Shop");
		driver.findElement(By.partialLinkText("Digital downloads")).click();
		if(given_Digitel_download_Title.contains(driver.getTitle())) {
			System.out.println("you are in a Digitel Download Page");
			List<WebElement> digitel_download = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			//add the digitel Download Products
			for (WebElement web : digitel_download) {
				web.click();
				Thread.sleep(1000);
			}
			//enter into the shopping cart
			driver.findElement(By.cssSelector("span[class='cart-label']")).click();
			WebElement shopping_Cart = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(shopping_Cart.isDisplayed()) {
				System.out.println("you are in Shopping cart page");
				List<WebElement> remove_checkBox = driver.findElements(By.cssSelector("input[type='checkbox']"));
				remove_checkBox.remove(remove_checkBox.size()-1);
				for (WebElement CheckBox : remove_checkBox) {
					CheckBox.click();
					Thread.sleep(1000);
				}
				driver.findElement(By.cssSelector("input[name='updatecart']")).click();
				driver.close();
			}
			else
				System.out.println("you are not in Shopping cart page ");
			
		}
		else
			System.out.println("you are not in a Digitel Download Page");
		
	}
	else
		System.out.println("you are not in demo web Shop");
	
}
}
