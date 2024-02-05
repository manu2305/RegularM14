package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {
public static void main(String[]mani) {
	         //Open Our Browser
	         ChromeDriver driver=new ChromeDriver();
	         //to maximize the Browser
	         driver.manage().window().maximize();
	         //to enter into a particular WebPage
	         driver.get("https://demowebshop.tricentis.com/");
	         
	         
}
}
