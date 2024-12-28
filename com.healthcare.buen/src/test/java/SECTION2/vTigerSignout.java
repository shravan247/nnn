package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vTigerSignout {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		WebElement img = driver.findElement(By.cssSelector("[src*='images/u']"));
		Actions act = new Actions(driver);
//act.moveToElement(img).perform();
//click after navigating to the image then clicking
//Thread.sleep(1000);
//driver.findElement(By.linkText("Sign Out")).click();

//click using click()
		WebElement signout = driver.findElement(By.xpath("//a[text()='Sign Out']"));
//act.click(signout).perform();

//perform all actions in single line
		act.moveToElement(img).click(signout).build().perform();
	}
}
