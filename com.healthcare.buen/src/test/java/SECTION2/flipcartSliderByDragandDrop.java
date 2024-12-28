package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipcartSliderByDragandDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.flipkart.com/");
		WebElement ele=driver.findElement(By.xpath("//span[@role='button']"));
		if(ele.isDisplayed()) {
			ele.click();
		}
		else {
			}
		driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("iphone 15");
		driver.findElement(By.cssSelector("[class*='iLD']")).click();
	WebElement slider=driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']/child::div[@class='_3FdLqY']"));
	Actions act=new Actions(driver);
	act.dragAndDropBy(slider, 1000, 0).perform();
	}

}
