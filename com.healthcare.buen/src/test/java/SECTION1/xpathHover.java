package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathHover {
/**
 * this method is to launch and access orange
 */
WebDriver driver;
public void accessbrowser() {
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
/**
 * this method is to login to orangehrm
 */
public void login() {
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
}
/**
 * this method is to get h_over message from orangeHRM (we can return also- but return type should be string)
 */
public void getHover() {
WebElement ele=driver.findElement(By.xpath("//button[@title='Assign Leave']"));
String text=ele.getAttribute("title");
System.out.println(text);
	}

}
