package SECTION2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jsGuruAlertpopup {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location=arguments[0]", "https://demo.guru99.com/test/simple_context_menu.html");
		WebElement btn=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions acti=new Actions(driver);
		acti.doubleClick(btn).perform();
		Thread.sleep(2000);

		//alert popup
	
		TargetLocator a=driver.switchTo();
		Alert act=a.alert();
		String text=act.getText();
		System.out.println(text);
		Thread.sleep(2000);
        act.accept();
	}

}
