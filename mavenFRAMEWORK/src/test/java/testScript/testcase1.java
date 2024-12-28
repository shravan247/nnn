package testScript;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.BaseTest;
import generic.listeners;
import pomScript.registerPage;
import pomScript.welcomePage;

@Listeners(listeners.class)
public class testcase1 extends BaseTest {
	SoftAssert soft = new SoftAssert();

	@Test(testName = "register", priority = 0)
	public void register() throws Exception {
		driver.get("https://demowebshop.tricentis.com/");
		
		extentTest.info("Navigate to url");
		welcomePage w = new welcomePage(driver);
		w.getRegisterButton().click();
		Thread.sleep(4000);
		String actual = driver.getCurrentUrl();
		soft.assertEquals(actual, "https://demowebshop.tricentis.com/register", "IncorrectURL");
		extentTest.pass("Assertion pass");

	}

	@Test(testName = "registerFields", dataProvider = "excel")
	public void registerFields(String gender, String fname, String lname, String email, String pass, String cpass) {
		driver.get("https://demowebshop.tricentis.com/register");
		welcomePage w = new welcomePage(driver);

		registerPage r = new registerPage(driver);
		if (gender == "male") {
			r.getGenderMale().click();
		} else {
			r.getGenderFemale().click();
		}
		r.getFirstname().sendKeys(fname);
		r.getLastname().sendKeys(lname);
		r.getEmail().sendKeys(email);
		r.getPassword().sendKeys(pass);
		r.getConfirmPassword().sendKeys(cpass);
		r.getRegisterButton().click();
		boolean flag = driver.findElement(By.linkText(email)).isDisplayed();
		soft.assertTrue(flag);
		w.getLogoutButton().click();
		soft.assertAll();
	}

}