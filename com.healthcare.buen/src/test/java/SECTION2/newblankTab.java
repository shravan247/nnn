package SECTION2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newblankTab {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.amazon.in/");
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.flipkart.com/");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("open('https://www.youtube.com/')");

	}

}
