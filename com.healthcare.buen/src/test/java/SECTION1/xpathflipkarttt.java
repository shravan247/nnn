package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathflipkarttt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("//span[@role='button']"));
		if (ele.isDisplayed()) {
			ele.click();
		} else {
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@data-id='MOBGNBFBABFZR3UR']//descendant::div[@class='_24_Dny']")).click();
	}
}
