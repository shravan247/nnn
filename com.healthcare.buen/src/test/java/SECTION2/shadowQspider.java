package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowQspider {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demoapps.qspiders.com/shadow?sublist=0");
		Thread.sleep(2000);
		
		//using selenium
		WebElement e = driver.findElement(By.xpath("//form[@class='pe-5']/div"));
		SearchContext shadow = e.getShadowRoot();
		shadow.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("username");
		WebElement e1 = driver.findElement(By.xpath("//form[@class='pe-5']/div/following-sibling::div"));
		SearchContext shadow1 = e1.getShadowRoot();
		shadow1.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
