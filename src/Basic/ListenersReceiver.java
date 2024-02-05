package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Basic.Listenners.class)
public class ListenersReceiver {
@Test
public void receiver() {
	System.out.println("hi hello");
	
}
public ListenersReceiver(WebDriver driver){
	PageFactory.initElements(driver,this);
}

@FindBy
}
