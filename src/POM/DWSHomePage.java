package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSHomePage {
	public DWSHomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="small-searchterms")
	WebElement searchField;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchbutton;
	
	public void searchField(String value) {
		searchField.sendKeys(value);
	}
	public void searchButton() {
		searchbutton.click();
	}
	
}
