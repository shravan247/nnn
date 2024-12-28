package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
			
			@FindBy(id = "Email")
			private WebElement emailid;
			@FindBy(id = "Password")
			private WebElement password;
			@FindBy(xpath = "//input[@value='Log in']")
			private WebElement loginbutton;
			public WebElement getEmailid() {
				return emailid;
			}
			public WebElement getPassword() {
				return password;
			}
			public WebElement getLoginbutton() {
				return loginbutton;
			}
			
}
