package SECTION2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSlaunchusingjavascript {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//access using javascript
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.location=arguments[0]", "https://www.amazon.in/");
	}

}
