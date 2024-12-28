package SECTION2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonKeysClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("Apple iphone 15",Keys.ENTER);
		//driver.findElement(By.name("field-keywords")).sendKeys(Keys.SHIFT,"apple",Keys.NULL,"iphone 15",Keys.ENTER);

	}

}
