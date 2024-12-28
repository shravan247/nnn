package SECTION2;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class takeScreenShotOfParticulatWebelement {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.get("https://www.amazon.in/");
WebElement search=driver.findElement(By.id("nav-search-submit-button"));
File source=search.getScreenshotAs(OutputType.FILE);
File destination=new File("./Screenshot/"+"search"+".png");
Files.copy(source, destination);

	}

}
