package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathSVGflipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);;
		WebElement ele=driver.findElement(By.xpath("//span[text()='✕']"));
		if(ele.isDisplayed()) {
			ele.click();
		}
		else {
		}
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		//svgtag
		driver.findElement(By.xpath("//*[name()='svg' and @width='24']")).click();
	}

}
