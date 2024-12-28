package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JScrolltillendFBlink {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//access using javascript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
		
		//1st method
		//WebElement ele=driver.findElement(By.xpath("//a[text()='Facebook']"));
		//js.executeScript("window.scrollBy(arguments[0].scrollIntoView())",ele);
		
		
		  //2ndmethod 
		WebElement ele=driver.findElement(By.xpath("//a[text()='Facebook']")); 
		int y=ele.getLocation().getY(); 
		js.executeScript("window.scrollBy(0,"+y+")",ele);
	}
}
