package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssCASEsensitive {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
		//login
		driver.findElement(By.cssSelector("[name='username'i]")).sendKeys("student");
		driver.findElement(By.cssSelector("[type*='pA'i]")).sendKeys("Password123");
		driver.findElement(By.cssSelector(".btn")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
