package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssFLIPKART {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);
//driver.findElement(By.cssSelector("._30XB9F")).click();
WebElement ele=driver.findElement(By.cssSelector("span[role='button']"));
if(ele.isDisplayed()) {
	ele.click();
}
else
{
	
}
driver.findElement(By.cssSelector("input.Pke_EE")).sendKeys("Iphone 15");
driver.findElement(By.cssSelector("[class*='iLD']")).click();
Thread.sleep(2000);
driver.quit();
	}
}
