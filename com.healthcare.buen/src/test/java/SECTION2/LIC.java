package SECTION2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIC {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.xpath("//a[@class='login1']")).click();
		TargetLocator a = driver.switchTo();
		Alert act = a.alert();
		Thread.sleep(1000);
		act.accept();
		String parent = driver.getWindowHandle();
		Set<String> Allid = driver.getWindowHandles();
		for (String id : Allid) {
			if (!(parent.equals(id))) {
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.id("da_textfield-1157-inputEl")).sendKeys("shravan");
	}

}
