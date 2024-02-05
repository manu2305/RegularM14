package RobotCLass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
public static void main(String[] args) throws AWTException {
	//open the the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_A);
		rbt.keyPress(KeyEvent.VK_D);
		rbt.keyPress(KeyEvent.VK_M);
		rbt.keyPress(KeyEvent.VK_I);
		rbt.keyPress(KeyEvent.VK_N);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_A);
		rbt.keyPress(KeyEvent.VK_D);
		rbt.keyPress(KeyEvent.VK_M);
		rbt.keyPress(KeyEvent.VK_I);
		rbt.keyPress(KeyEvent.VK_N);
		rbt.keyPress(KeyEvent.VK_TAB);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
		rbt.keyRelease(KeyEvent.VK_A);
		rbt.keyRelease(KeyEvent.VK_D);
		rbt.keyRelease(KeyEvent.VK_M);
		rbt.keyRelease(KeyEvent.VK_I);
		rbt.keyRelease(KeyEvent.VK_N);
		rbt.keyRelease(KeyEvent.VK_TAB);
		rbt.keyRelease(KeyEvent.VK_ENTER);
		
}
}
