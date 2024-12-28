package pomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomePage {

	public welcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "ico-register")
	private WebElement registerButton;
	@FindBy(className = "ico-login")
	private WebElement loginbutton;
	@FindBy(className = "ico-logout")
	private WebElement logoutButton;
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getLogoutButton() {
		return logoutButton;
	}

	
}
