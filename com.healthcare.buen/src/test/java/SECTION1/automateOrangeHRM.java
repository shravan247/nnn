package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateOrangeHRM {
	WebDriver driver;
	public void accessBrowser() {
 driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public void linkText() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//driver.findElement(By.partialLinkText("OrangeHRM")).click();
		//driver.quit();
	}

}
