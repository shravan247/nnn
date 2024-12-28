package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathamazoncheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		WebElement el = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		el.sendKeys("iphone");
		el.submit();
		String Text = "Get It in 2 Days";
		driver.findElement(By.xpath("//span[text()='" + Text + "']/ancestor::li//i")).click();
	}

}
