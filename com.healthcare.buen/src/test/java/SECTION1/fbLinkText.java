package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLinkText {

WebDriver driver;
public void accessBrowser() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
}
public void link() throws Throwable {
driver.findElement(By.linkText("Forgotten password?")).click();
//driver.findElement(By.partialLinkText("Forgotten")).click();
Thread.sleep(2000);
driver.quit();
}
	}

