package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day17GIftCartAssignmentAttributeXpath {
	static WebDriver driver;
	static String given_url="https://demowebshop.tricentis.com/";
	static String given_title="Demo Web Shop. $25 Virtual Gift Card";
public static void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
public static void closeBrowser() {
	driver.close();
}
public static void giftCart() throws InterruptedException {
	driver.get("https://demowebshop.tricentis.com/");
	String current_url = driver.getCurrentUrl();
	String[]name= {"mani","jmani@gmail.com","mani","jmani@gmail.com"};
	if(given_url.equals(current_url)) {
		System.out.println("iam in DWS HomePage");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(1000);
		String current_title = driver.getTitle();
		Thread.sleep(1000);
		if(given_title.contains(current_title)) {
			System.out.println("you are in $25 Gift cart");
			Thread.sleep(1000);
			 List<WebElement> gift_field = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
			 Thread.sleep(1000);
			 int i=0;
			 for (WebElement web : gift_field) {
				web.sendKeys(name[i++]);
				Thread.sleep(1000);
			}
			 driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("hi hello how are you");
			 WebElement qty = driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']"));
			 qty.clear();
			 Thread.sleep(1000);
			 qty.sendKeys("3");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			 WebElement checkBox = driver.findElement(By.xpath("//input[@name='removefromcart']"));
			 checkBox.click();
			 if(checkBox.isSelected()) {
				 System.out.println("your checkBox is Selected");
				 WebElement update_Cart = driver.findElement(By.xpath("//input[@name='updatecart']"));
				 if(update_Cart.isEnabled()) {
					 System.out.println("update_cart click is Successfull");
					 update_Cart.click();
				 }
				 else
					 System.out.println("update_cart click is UnSuccessfull");
			 }
			 else {
				 System.out.println("your checkBox is not selected");
			 }
			 
			 
		}
		else {
			System.out.println("check the title of the page");
			driver.close();
		}
	}
	else {
		System.out.println("Check the Url of the Page");
		driver.close();
		}
	
}
public static void main(String[] args) throws InterruptedException {
openBrowser();
giftCart();
//closeBrowser();
}

}
