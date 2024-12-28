package SECTION1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathGettitleOfProduct {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//WebElement a=driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//span[text()='Apple iPhone 15 (128 GB) - Blue']"));
		WebElement b=driver.findElement(By.xpath("//u[text()='+4 colors/patterns']//ancestor::div[@cel_widget_id='MAIN-SEARCH_RESULTS-3']//span[text()='Apple iPhone 15 (128 GB) - Blue']"));
		String text=b.getText();
System.out.println(text);
driver.quit();
	}

}
