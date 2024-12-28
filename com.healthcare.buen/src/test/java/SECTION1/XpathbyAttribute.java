package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAttribute {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://practicetestautomation.com/practice-test-login/");
//login using xpath
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
driver.findElement(By.xpath("//button[@id='submit']")).click();
Thread.sleep(2000);
driver.quit();
	}

}
