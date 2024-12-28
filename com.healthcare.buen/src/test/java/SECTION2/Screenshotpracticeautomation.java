package SECTION2;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotpracticeautomation {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//access using javascript
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.location=arguments[0]", "https://practicetestautomation.com/practice-test-login/");
//highlight usenametextfield
WebElement un=driver.findElement(By.name("username"));
js.executeScript("arguments[0].style.border='3px solid red'", un);
//typecasting
TakesScreenshot ts=(TakesScreenshot)driver;
//store inside java
File source=ts.getScreenshotAs(OutputType.FILE);
//store in desired location
File des=new File("./Screenshot/"+"username"+".png");
//copy java to location
Files.copy(source, des);
	}

}
