package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoZoneCSS {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");

		WebElement ele = driver.findElement(By.cssSelector("p.class1"));

		String text = ele.getText();
		System.out.println(text);
//String text= driver.findElement(By.cssSelector("p[class*='cl']")).getText();
//System.out.println(text);
		Thread.sleep(2000);
		driver.quit();

	}

}
