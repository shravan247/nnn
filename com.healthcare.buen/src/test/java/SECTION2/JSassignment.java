package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSassignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//access using javascript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
		
		driver.findElement(By.name("field-keywords")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Slate']")); 
		int y=ele.getLocation().getY(); 
		js.executeScript("window.scrollBy(0,"+y+")",ele);
	
	}

}
